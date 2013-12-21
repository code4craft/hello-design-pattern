package helloworld.abstract_factory;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class DesignPatternHelloWorldFactory implements HelloWorldFactory{
    @Override
    public HelloWorld createHelloWorld() {
        return new DesignPatternHelloWorld();
    }

    class DesignPatternHelloWorld implements HelloWorld{

        @Override
        public String helloWorld() {
            return "Hello world, Abstract Factory!";
        }
    }
}
