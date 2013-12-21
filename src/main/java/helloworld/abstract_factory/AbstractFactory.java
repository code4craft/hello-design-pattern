package helloworld.abstract_factory;

/**
 * @author yihua.huang@dianping.com
 */
public class AbstractFactory{


    public static HelloWorldFactory designPatternFactory() {
        return new DesignPatternHelloWorldFactory();
    }

    public static HelloWorldFactory javaFactory() {
        return new JavaHelloWorldFactory();
    }
}
