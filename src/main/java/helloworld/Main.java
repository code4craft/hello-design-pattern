package helloworld;

import helloworld.behavioral.chain_of_responsibility.DesignPatternHandler;
import helloworld.behavioral.chain_of_responsibility.HelloHandler;
import helloworld.behavioral.chain_of_responsibility.HelloWorldHandler;
import helloworld.behavioral.command.Command;
import helloworld.behavioral.command.HelloWorldPrintCommand;
import helloworld.behavioral.interpreter.HelloWorldInterpreter;
import helloworld.behavioral.mediator.HelloWorldMediator;
import helloworld.behavioral.mediator.HelloWorldSlogan;
import helloworld.behavioral.mediator.HelloWorldTarget;
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
import helloworld.structural.flyweight.HelloWorldFlyWeightFactory;
import helloworld.structural.proxy.HelloWorldProxy;

/**
 * @author yihua.huang@dianping.com
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        System.out.println("We are creational patterns!");

        SplitHelloWorldFactory abstractFactory = AbstractFactory.select(AbstractFactory.Type.DesignPattern);
        HelloWorld abstractFactoryHelloWorld = new SplitHelloWorld(abstractFactory.createHelloWorldSlogan(),
                abstractFactory.createHelloWorldTarget());
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

        System.out.println("We are structural patterns!");

        HelloWorld adapterHelloWorld = new HelloWorldAdapter(new HelloAdapterDesignPattern());
        System.out.println(adapterHelloWorld.helloWorld());

        HelloWorld bridgeHelloWorld = new HelloWorldBridge(new DesignPatternWorldImpl());
        //leave bridgeHelloWorld' output to compositeHelloWorld

        HelloWorld compositeHelloWorld = new CompositeHelloWorld(bridgeHelloWorld, new CompositeHelloWorld.DefaultHelloWorld());
        System.out.println(compositeHelloWorld.helloWorld());

        HelloWorldDecorator decoratorHelloWorld = new HelloWorldDecorator(new HelloWorldDecorator.DefaultHelloWorld());
        System.out.println(decoratorHelloWorld.helloDecorator());

        HelloWorld facadeHelloWorld = HelloWorldFacade.instance().facadeHelloWorld();
        System.out.println(facadeHelloWorld.helloWorld());

        HelloWorld flyWeightHelloWorld = HelloWorldFlyWeightFactory.instance().createHelloWorld("Hello Flyweight!");
        System.out.println(flyWeightHelloWorld.helloWorld());

        HelloWorld proxyHelloWorld = new HelloWorldProxy(new HelloWorldProxy.DefaultHelloWorld());
        System.out.println(proxyHelloWorld.helloWorld());

        System.out.println("We are behavioral patterns!");

        HelloWorldHandler helloWorldChainOfResponsibility = new HelloHandler().setNext(new DesignPatternHandler());
        System.out.println(helloWorldChainOfResponsibility.helloWorld());

        Command helloWorldCommand = new HelloWorldPrintCommand();
        helloWorldCommand.execute();

        HelloWorldInterpreter helloWorldInterpreter = new HelloWorldInterpreter();
        helloWorldInterpreter.interpret("println('Hello Interpreter!')");

        HelloWorldSlogan helloWorldSlogan = new HelloWorldSlogan();
        HelloWorldTarget helloWorldTarget = new HelloWorldTarget();
        HelloWorldMediator helloWorldMediator = new HelloWorldMediator(helloWorldSlogan,helloWorldTarget);
        helloWorldSlogan.setHelloWorldMediator(helloWorldMediator);
        helloWorldTarget.setHelloWorldMediator(helloWorldMediator);
        System.out.println(helloWorldTarget.helloWorld());

    }
}
