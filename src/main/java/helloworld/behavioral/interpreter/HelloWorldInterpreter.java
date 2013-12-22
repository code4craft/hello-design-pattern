package helloworld.behavioral.interpreter;

import org.apache.commons.lang3.StringUtils;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Very tiny expression without any error check.
 * NOT thread safe!
 * <pre>
 *     statement ::= function "(" single_quote string_parameter single_quote ")"
 *     e.g.
 *        println('Hello World!');
 * </pre>
 *
 * @author yihua.huang@dianping.com
 */
public class HelloWorldInterpreter {

    private Map<String, Function> functions;

    public HelloWorldInterpreter() {
        registerFunction("println", new PrintlnFunction());
    }

    public void interpret(String expr) {
        String functionName = StringUtils.trim(StringUtils.substringBefore(expr, "("));
        Function function = functions.get(functionName);
        String stringParam = StringUtils.strip(StringUtils.substringBeforeLast(StringUtils.substringAfter(expr, "("), ")"), "'");
        function.call(stringParam);
    }

    public void registerFunction(String name, Function function) {
        if (functions == null) {
            functions = new HashMap<String, Function>();
        }
        functions.put(name, function);
    }

    static class PrintlnFunction implements Function {

        private PrintStream printer = System.out;

        void setPrinter(PrintStream printer) {
            this.printer = printer;
        }

        @Override
        public void call(String paramString) {
            printer.println(paramString);
        }
    }

    private interface Function {
        public void call(String paramString);
    }

}
