package helloworld.behavioral.mediator;

import helloworld.HelloWorld;
import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldInterjection implements SplitHelloWorld.HelloWorldInterjection, HelloWorld {

    private HelloWorldMediator helloWorldMediator;

    private static final String separator = " ";

    private static final String terminator = "!";

    public void setHelloWorldMediator(HelloWorldMediator helloWorldMediator) {
        this.helloWorldMediator = helloWorldMediator;
    }

    @Override
    public String interjection() {
        return "Hello";
    }

    @Override
    public String helloWorld() {
        return interjection() + separator + helloWorldMediator.object() + terminator;
    }
}
