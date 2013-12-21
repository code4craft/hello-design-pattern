package helloworld.structural.proxy;

import helloworld.HelloWorld;
import org.apache.commons.lang3.StringUtils;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldProxy implements HelloWorld {

    private HelloWorld helloWorld;

    public HelloWorldProxy(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public String helloWorld() {
        return StringUtils.substringBefore(helloWorld.helloWorld()," ")+" Proxy!";
    }

    public static class DefaultHelloWorld implements HelloWorld {

        @Override
        public String helloWorld() {
            return "Hello World!";
        }
    }
}
