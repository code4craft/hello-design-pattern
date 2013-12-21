package helloworld;

import helloworld.creational.abstract_factory.AbstractFactory;
import helloworld.creational.abstract_factory.SplitHelloWorldFactory;
import helloworld.creational.builder.HelloWorldBuilder;
import helloworld.creational.factory_method.FactoryMethodHelloWorldFactory;
import helloworld.creational.prototype.HelloWorldPrototype;
import helloworld.creational.singleton.HelloWorldSingleton;
import helloworld.structural.adapter.HelloAdapterDesignPattern;
import helloworld.structural.adapter.HelloWorldAdapter;
import helloworld.structural.bridge.DesignPatternWorldImpl;
import helloworld.structural.bridge.HelloWorldBridge;
import helloworld.structural.composite.CompositeHelloWorld;
import helloworld.structural.decorator.HelloWorldDecorator;
import helloworld.structural.facade.HelloWorldFacade;

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
         * Difference between "abstract factory" and "factory method" is the abstracting point:
         *  1. Abstracting point of abstract factory is factory.
         *  2. Abstracting point of factory method is generated object.
         */
        FactoryMethodHelloWorldFactory factoryMethodHelloWorldFactory = new FactoryMethodHelloWorldFactory();
        HelloWorld factoryMethodHelloWorld = factoryMethodHelloWorldFactory.createHelloWorld();
        System.out.println(factoryMethodHelloWorld.helloWorld());

        HelloWorld prototypeHelloWorld = HelloWorldPrototype.PROTOTYPE.clone();
        System.out.println(prototypeHelloWorld.helloWorld());

        HelloWorld singletonHelloWorld = HelloWorldSingleton.instance();
        System.out.println(singletonHelloWorld.helloWorld());

        HelloWorld adapterHelloWorld = new HelloWorldAdapter(new HelloAdapterDesignPattern());
        System.out.println(adapterHelloWorld.helloWorld());

        HelloWorld bridgeHelloWorld = new HelloWorldBridge(new DesignPatternWorldImpl());
        //leave bridgeHelloWorld' output to compositeHelloWorld

        HelloWorld compositeHelloWorld = new CompositeHelloWorld(bridgeHelloWorld, new CompositeHelloWorld.DefaultHelloWorld());
        System.out.println(compositeHelloWorld.helloWorld());

        HelloWorldDecorator helloWorldDecorator = new HelloWorldDecorator(new HelloWorldDecorator.DefaultHelloWorld());
        System.out.println(helloWorldDecorator.helloWorld());

        HelloWorld facadeHelloWorld = HelloWorldFacade.instance().facadeHelloWorld();
        System.out.println(facadeHelloWorld.helloWorld());
    }
}
