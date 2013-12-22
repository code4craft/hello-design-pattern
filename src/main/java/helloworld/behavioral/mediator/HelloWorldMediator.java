package helloworld.behavioral.mediator;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldMediator {

    private SplitHelloWorld.HelloWorldSlogan helloWorldSlogan;

    private SplitHelloWorld.HelloWorldTarget helloWorldTarget;

    public HelloWorldMediator(SplitHelloWorld.HelloWorldSlogan helloWorldSlogan, SplitHelloWorld.HelloWorldTarget helloWorldTarget) {
        this.helloWorldSlogan = helloWorldSlogan;
        this.helloWorldTarget = helloWorldTarget;
    }

    public String slogan() {
        return helloWorldSlogan.slogan();
    }

    public String target() {
        return helloWorldTarget.target();
    }

}
