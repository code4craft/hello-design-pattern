package helloworld.abstract_factory;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public interface HelloWorldFactory {

    public SplitHelloWorld.HelloWorldSlogan createHelloWorldSlogan();

    public SplitHelloWorld.HelloWorldTarget createHelloWorldTarget();
}
