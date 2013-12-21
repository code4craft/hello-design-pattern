package helloworld;

import helloworld.abstract_factory.AbstractFactory;
import helloworld.abstract_factory.HelloWorldFactory;
import helloworld.builder.HelloWorldBuilder;

/**
 * @author yihua.huang@dianping.com
 */
public class Main {

    public static void main(String[] args) {

        HelloWorldFactory helloWorldFactory = AbstractFactory.designPatternFactory();
        HelloWorld abstractFactoryHelloWorld = new SplitHelloWorld(helloWorldFactory.createHelloWorldSlogan(),
                helloWorldFactory.createHelloWorldTarget());
        System.out.println(abstractFactoryHelloWorld.helloWorld());

        HelloWorld builderHelloWorld = HelloWorldBuilder.builder()
                .slogan("Hello")
                .target("Builder").getHelloWorld();
        System.out.println(builderHelloWorld.helloWorld());

    }
}
