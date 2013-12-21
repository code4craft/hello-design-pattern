package helloworld.structural.facade;

import helloworld.HelloWorld;
import helloworld.creational.builder.HelloWorldBuilder;
import helloworld.structural.decorator.HelloWorldDecorator;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldFacade {

    private HelloWorldFacade(){
    }

    /**
     * facade is usually used with singleton
     */
    public static HelloWorldFacade instance(){
        return HelloWorldFacadeInner.INSTANCE;
    }

    private static class HelloWorldFacadeInner {
        private final static HelloWorldFacade INSTANCE = new HelloWorldFacade();
    }

    public HelloWorld facadeHelloWorld(){
        return HelloWorldBuilder.builder()
                .slogan("Hello")
                .target("Facade").getHelloWorld();
    }

}
