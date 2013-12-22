package helloworld.behavioral.command;

import helloworld.behavioral.Printer;
import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldPrintCommandTest {

    @Test
    public void testHelloWorldPrintCommand(){
        HelloWorldPrintCommand helloWorldPrintCommand = new HelloWorldPrintCommand();
        Printer mockPrinter = mock(Printer.class);
        helloWorldPrintCommand.setPrinter(mockPrinter);
        helloWorldPrintCommand.execute();
        verify(mockPrinter,times(1)).println("Hello Command!");
    }
}
