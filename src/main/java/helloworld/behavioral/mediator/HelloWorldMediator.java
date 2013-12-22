package helloworld.behavioral.mediator;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldMediator {

    private SplitHelloWorld.HelloWorldInterjection helloWorldInterjection;

    private SplitHelloWorld.HelloWorldObject helloWorldObject;

    public HelloWorldMediator(SplitHelloWorld.HelloWorldInterjection helloWorldInterjection, SplitHelloWorld.HelloWorldObject helloWorldObject) {
        this.helloWorldInterjection = helloWorldInterjection;
        this.helloWorldObject = helloWorldObject;
    }

    public String slogan() {
        return helloWorldInterjection.slogan();
    }

    public String target() {
        return helloWorldObject.target();
    }

}
