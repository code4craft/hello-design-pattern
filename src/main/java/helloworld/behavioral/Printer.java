package helloworld.behavioral;

/**
 * @author yihua.huang@dianping.com
 */
public class Printer {

    private Printer() {
    }

    public static Printer instance(){
        return PrinterHolder.INSTANCE;
    }

    private static class PrinterHolder {
        private final static Printer INSTANCE = new Printer();
    }

    public void println(String line) {
        System.out.println(line);
    }
}
