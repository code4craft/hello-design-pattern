package helloworld.abstract_factory;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public interface SplitHelloWorldFactory {

    public SplitHelloWorld.HelloWorldSlogan createHelloWorldSlogan();

    public SplitHelloWorld.HelloWorldTarget createHelloWorldTarget();
}
