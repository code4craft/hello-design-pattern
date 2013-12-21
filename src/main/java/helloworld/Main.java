package helloworld;

import helloworld.abstract_factory.AbstractFactory;

/**
 * @author yihua.huang@dianping.com
 */
public class Main {

    public static void main(String[] args) {
        HelloWorld helloWorld = AbstractFactory.factory().createHelloWorld();
        System.out.println(helloWorld.helloWorld());
    }
}
