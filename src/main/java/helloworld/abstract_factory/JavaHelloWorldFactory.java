package helloworld.abstract_factory;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class JavaHelloWorldFactory implements HelloWorldFactory{
    @Override
    public HelloWorld createHelloWorld() {
        return new JavaHelloWorld();
    }

    class JavaHelloWorld implements HelloWorld{

        @Override
        public String helloWorld() {
            return "Hello world, Java!";
        }
    }
}
