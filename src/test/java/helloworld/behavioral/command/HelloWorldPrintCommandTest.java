package helloworld.behavioral.command;

import com.sun.org.apache.xml.internal.serialize.Printer;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldPrintCommandTest {

    @Test
    public void testHelloWorldPrintCommand(){
        HelloWorldPrintCommand helloWorldPrintCommand = new HelloWorldPrintCommand();
        PrintStream mockPrinter = mock(PrintStream.class);
        helloWorldPrintCommand.setPrinter(mockPrinter);
        helloWorldPrintCommand.execute();
        verify(mockPrinter,times(1)).println("Hello Command!");
    }
}
