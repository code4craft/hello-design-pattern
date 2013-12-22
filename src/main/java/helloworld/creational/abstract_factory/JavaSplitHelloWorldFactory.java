package helloworld.creational.abstract_factory;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class JavaSplitHelloWorldFactory implements SplitHelloWorldFactory {

    @Override
    public SplitHelloWorld.HelloWorldInterjection createHelloWorldInterjection() {
        return new SplitHelloWorld.DefaultInterjection();
    }

    @Override
    public SplitHelloWorld.HelloWorldObject createHelloWorldObject() {
        return new JavaHelloWorldObject();
    }

    class JavaHelloWorldObject implements SplitHelloWorld.HelloWorldObject {

        @Override
        public String object() {
            return "Java";
        }
    }
}
