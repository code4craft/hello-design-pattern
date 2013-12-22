package helloworld.behavioral.interpreter;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldInterpreterTest {

    @Test
    public void testHelloWorldInterpreter(){
        HelloWorldInterpreter helloWorldInterpreter = new HelloWorldInterpreter();
        PrintStream mockPrinter = mock(PrintStream.class);
        HelloWorldInterpreter.PrintlnFunction printlnFunction = new HelloWorldInterpreter.PrintlnFunction();
        printlnFunction.setPrinter(mockPrinter);
        helloWorldInterpreter.registerFunction("println",printlnFunction);
        helloWorldInterpreter.interpret("println('Hello Interpreter!')");
        verify(mockPrinter,times(1)).println("Hello Interpreter!");
    }
}
