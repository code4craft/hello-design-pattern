package helloworld.behavioral;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * @author yihua.huang@dianping.com
 */
public class PrinterTest {

    @Test
    public void testPrinter() {
        Printer printer = Printer.instance();
        PrintStream mockPrintStream = mock(PrintStream.class);
        when(System.out).thenReturn(mockPrintStream);
        printer.println("Hello World!");
        verify(mockPrintStream,times(1)).println("Hello World!");
    }
}
