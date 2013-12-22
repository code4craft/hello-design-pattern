package helloworld.behavioral.observer;

import java.io.PrintStream;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldObserver implements Observer{

    private PrintStream printer = System.out;

    public void setPrinter(PrintStream printer) {
        this.printer = printer;
    }

    @Override
    public void update() {
        printer.println("Hello Observer!");
    }
}
