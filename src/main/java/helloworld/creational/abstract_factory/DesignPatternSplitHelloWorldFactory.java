package helloworld.creational.abstract_factory;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class DesignPatternSplitHelloWorldFactory implements SplitHelloWorldFactory {

    @Override
    public SplitHelloWorld.HelloWorldSlogan createHelloWorldSlogan() {
        return new SplitHelloWorld.DefaultSlogan();
    }

    @Override
    public SplitHelloWorld.HelloWorldTarget createHelloWorldTarget() {
        return new DesignPatternHelloWorldTarget();
    }

    class DesignPatternHelloWorldTarget implements SplitHelloWorld.HelloWorldTarget {

        @Override
        public String target() {
            return "Abstract Factory";
        }
    }
}
