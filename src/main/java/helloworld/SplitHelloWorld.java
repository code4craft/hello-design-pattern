package helloworld;

/**
 * Split "Hello World" to "Hello"(slogan) and "World"(target) so that you can configure it separately.
 *
 * @author yihua.huang@dianping.com
 */
public class SplitHelloWorld implements HelloWorld {

    private HelloWorldSlogan helloWorldSlogan;

    private HelloWorldTarget helloWorldTarget;

    private static final String separator = " ";

    private static final String terminator = "!";

    public SplitHelloWorld(HelloWorldSlogan helloWorldSlogan, HelloWorldTarget helloWorldTarget) {
        this.helloWorldSlogan = helloWorldSlogan;
        this.helloWorldTarget = helloWorldTarget;
    }

    @Override
    public String helloWorld() {
        return helloWorldSlogan.slogan() + separator + helloWorldTarget.target() + terminator;
    }

    public interface HelloWorldSlogan {

        public String slogan();
    }

    public interface HelloWorldTarget {

        public String target();
    }

    public static class DefaultSlogan implements HelloWorldSlogan {

        @Override
        public String slogan() {
            return "Hello";
        }
    }

    public HelloWorldSlogan getHelloWorldSlogan() {
        return helloWorldSlogan;
    }

    public HelloWorldTarget getHelloWorldTarget() {
        return helloWorldTarget;
    }
}
