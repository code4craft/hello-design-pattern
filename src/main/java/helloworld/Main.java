package helloworld;

import helloworld.abstract_factory.AbstractFactory;
import helloworld.abstract_factory.SplitHelloWorldFactory;
import helloworld.builder.HelloWorldBuilder;
import helloworld.factory_method.FactoryMethodHelloWorldFactory;

/**
 * @author yihua.huang@dianping.com
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        SplitHelloWorldFactory splitHelloWorldFactory = AbstractFactory.select(AbstractFactory.Type.DesignPattern);
        HelloWorld abstractFactoryHelloWorld = new SplitHelloWorld(splitHelloWorldFactory.createHelloWorldSlogan(),
                splitHelloWorldFactory.createHelloWorldTarget());
        System.out.println(abstractFactoryHelloWorld.helloWorld());

        HelloWorld builderHelloWorld = HelloWorldBuilder.builder()
                .slogan("Hello")
                .target("Builder").getHelloWorld();
        System.out.println(builderHelloWorld.helloWorld());

        /**
         * Difference from abstract factory is the abstracting point:
         *  1. Abstracting point of abstract factory is factory.
         *  2. Abstracting point of factory method is generated object.
         */
        FactoryMethodHelloWorldFactory factoryMethodHelloWorldFactory = new FactoryMethodHelloWorldFactory();
        HelloWorld factoryMethodHelloWorld = factoryMethodHelloWorldFactory.createHelloWorld();
        System.out.println(factoryMethodHelloWorld.helloWorld());

    }
}
