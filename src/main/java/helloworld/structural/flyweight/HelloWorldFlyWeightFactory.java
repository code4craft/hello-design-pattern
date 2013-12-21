package helloworld.structural.flyweight;

import helloworld.HelloWorld;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldFlyWeightFactory {

    private Map<String, HelloWorld> innerCache;

    private HelloWorldFlyWeightFactory() {
        innerCache = new HashMap<String, HelloWorld>();
    }

    /**
     * factory is singleton
     */
    public static HelloWorldFlyWeightFactory instance() {
        return HelloWorldFactoryHolder.INSTANCE;
    }

    public HelloWorld createHelloWorld(String value) {
        if (innerCache.containsKey(value)) {
            return innerCache.get(value);
        } else {
            HelloWorldFlyWeight helloWorldFlyWeight = new HelloWorldFlyWeight(value);
            innerCache.put(value, helloWorldFlyWeight);
            return helloWorldFlyWeight;
        }
    }

    private static class HelloWorldFactoryHolder {
        private static final HelloWorldFlyWeightFactory INSTANCE = new HelloWorldFlyWeightFactory();
    }
}
