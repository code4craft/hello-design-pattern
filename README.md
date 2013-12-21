hello-design-pattern
====================

Hello world use all 23 kinds of GoF design patterns.

```java
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        System.out.println("We are creational patterns!");

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

        System.out.println("We are structural patterns!");

        HelloWorld adapterHelloWorld = new HelloWorldAdapter(new HelloAdapterDesignPattern());
        System.out.println(adapterHelloWorld.helloWorld());

        HelloWorld bridgeHelloWorld = new HelloWorldBridge(new DesignPatternWorldImpl());
        //leave bridgeHelloWorld' output to compositeHelloWorld

        HelloWorld compositeHelloWorld = new CompositeHelloWorld(bridgeHelloWorld, new CompositeHelloWorld.DefaultHelloWorld());
        System.out.println(compositeHelloWorld.helloWorld());

        HelloWorldDecorator helloWorldDecorator = new HelloWorldDecorator(new HelloWorldDecorator.DefaultHelloWorld());
        System.out.println(helloWorldDecorator.helloDecorator());

        HelloWorld facadeHelloWorld = HelloWorldFacade.instance().facadeHelloWorld();
        System.out.println(facadeHelloWorld.helloWorld());

        HelloWorld flyWeightHelloWorld = HelloWorldFlyWeightFactory.instance().createHelloWorld("Hello Flyweight!");
        System.out.println(flyWeightHelloWorld.helloWorld());

        HelloWorldProxy helloWorldProxy = new HelloWorldProxy(new HelloWorldProxy.DefaultHelloWorld());
        System.out.println(helloWorldProxy.helloWorld());

        System.out.println("We are behavioral patterns!");
    }
}
```