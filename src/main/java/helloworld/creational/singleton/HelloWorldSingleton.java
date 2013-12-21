package helloworld.creational.singleton;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldSingleton implements HelloWorld {

    @Override
    public String helloWorld() {
        return "Hello Singleton!";
    }

    public static HelloWorldSingleton instance() {
        return HelloWorldSingletonInner.INSTANCE;
    }

    private HelloWorldSingleton() {

    }

    static class HelloWorldSingletonInner {
        private static final HelloWorldSingleton INSTANCE = new HelloWorldSingleton();
    }

}
