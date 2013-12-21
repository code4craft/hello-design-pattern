package helloworld.structural.flyweight;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldFlyWeight implements HelloWorld {

    private final String value;

    public HelloWorldFlyWeight(String value) {
        this.value = value;
    }

    @Override
    public String helloWorld() {
        return value;
    }

}
