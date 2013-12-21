package helloworld.abstract_factory;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class JavaSplitHelloWorldFactory implements SplitHelloWorldFactory {

    @Override
    public SplitHelloWorld.HelloWorldSlogan createHelloWorldSlogan() {
        return new SplitHelloWorld.DefaultSlogan();
    }

    @Override
    public SplitHelloWorld.HelloWorldTarget createHelloWorldTarget() {
        return new JavaHelloWorldTarget();
    }

    class JavaHelloWorldTarget implements SplitHelloWorld.HelloWorldTarget{

        @Override
        public String target() {
            return "Java";
        }
    }
}
