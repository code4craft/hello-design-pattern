package helloworld.creational.abstract_factory;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class DesignPatternSplitHelloWorldFactory implements SplitHelloWorldFactory {

    @Override
    public SplitHelloWorld.HelloWorldInterjection createHelloWorldSlogan() {
        return new SplitHelloWorld.DefaultInterjection();
    }

    @Override
    public SplitHelloWorld.HelloWorldObject createHelloWorldTarget() {
        return new DesignPatternHelloWorldObject();
    }

    class DesignPatternHelloWorldObject implements SplitHelloWorld.HelloWorldObject {

        @Override
        public String target() {
            return "Abstract Factory";
        }
    }
}
