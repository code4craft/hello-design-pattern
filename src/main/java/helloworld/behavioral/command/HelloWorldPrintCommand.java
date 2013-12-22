package helloworld.behavioral.command;

import helloworld.behavioral.Printer;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldPrintCommand implements Command {

    private Printer printer = Printer.instance();

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void execute() {
        printer.println("Hello Command!");
    }
}
