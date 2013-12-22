package helloworld.behavioral.command;

import java.io.PrintStream;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldPrintCommand implements Command {

    private PrintStream printer = System.out;

    public void setPrinter(PrintStream printer) {
        this.printer = printer;
    }

    @Override
    public void execute() {
        printer.println("Hello Command!");
    }
}
