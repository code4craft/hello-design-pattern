package helloworld.creational.abstract_factory;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public interface SplitHelloWorldFactory {

    public SplitHelloWorld.HelloWorldInterjection createHelloWorldInterjection();

    public SplitHelloWorld.HelloWorldObject createHelloWorldObject();
}
