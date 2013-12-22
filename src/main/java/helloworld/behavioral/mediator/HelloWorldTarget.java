package helloworld.behavioral.mediator;

import helloworld.HelloWorld;
import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldTarget implements SplitHelloWorld.HelloWorldTarget, HelloWorld {

    private HelloWorldMediator helloWorldMediator;

    private static final String separator = " ";

    private static final String terminator = "!";

    public void setHelloWorldMediator(HelloWorldMediator helloWorldMediator) {
        this.helloWorldMediator = helloWorldMediator;
    }

    @Override
    public String target() {
        return "Mediator";
    }

    @Override
    public String helloWorld() {
        return helloWorldMediator.slogan() + separator + target() + terminator;
    }
}
