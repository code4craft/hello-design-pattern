package helloworld.structural.bridge;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldBridge implements HelloWorld{

    private HelloWorldImpl helloWorldImpl;

    public HelloWorldBridge(HelloWorldImpl helloWorldImpl) {
        this.helloWorldImpl = helloWorldImpl;
    }

    @Override
    public String helloWorld() {
        return helloWorldImpl.generate();
    }
}
