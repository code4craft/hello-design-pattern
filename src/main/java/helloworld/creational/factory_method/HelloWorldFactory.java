package helloworld.creational.factory_method;

import helloworld.HelloWorld;

/**
 * <pre>
 * Difference from abstract factory is the abstracting point:
 * 1. Abstracting point of abstract factory is factory.
 * 2. Abstracting point of factory method is generated object.
 *
 * </pre>
 * @author yihua.huang@dianping.com
 */
public class HelloWorldFactory {

    public HelloWorld createHelloWorld(){
        return new HelloWorld() {
            @Override
            public String helloWorld() {
                return "Hello World!";
            }
        };
    }
}
