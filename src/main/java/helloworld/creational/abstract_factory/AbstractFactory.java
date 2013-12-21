package helloworld.creational.abstract_factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yihua.huang@dianping.com
 */
public class AbstractFactory {

    public enum Type {
        Java, DesignPattern;
    }

    private static Map<Type, Class<? extends SplitHelloWorldFactory>> map;

    static {
        map = new HashMap<Type, Class<? extends SplitHelloWorldFactory>>();
        map.put(Type.Java, JavaSplitHelloWorldFactory.class);
        map.put(Type.DesignPattern, DesignPatternSplitHelloWorldFactory.class);
    }

    public static SplitHelloWorldFactory select(Type type) throws IllegalAccessException, InstantiationException {
        return map.get(type).newInstance();
    }

}
