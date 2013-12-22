package helloworld.behavioral.interpreter;

import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldInterpreterTest {

    @Test
    public void testHelloWorldInterpreter(){
        HelloWorldInterpreter helloWorldInterpreter = new HelloWorldInterpreter();
        HelloWorldInterpreter.PrintlnFunction mockPrintlnFunction = mock(HelloWorldInterpreter.PrintlnFunction.class);
        helloWorldInterpreter.registerFunction("println",mockPrintlnFunction);
        helloWorldInterpreter.interpret("println('Hello Interpreter!')");
        verify(mockPrintlnFunction,times(1)).call("Hello Interpreter!");
    }
}
