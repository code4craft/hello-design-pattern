package helloworld.structural.decorator;

import helloworld.HelloWorld;
import org.apache.commons.lang3.StringUtils;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldDecorator implements HelloWorld {

    private HelloWorld helloWorld;

    public HelloWorldDecorator(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public String helloWorld() {
        return StringUtils.substringBefore(helloWorld.helloWorld()," ")+" Decorator!";
    }

    public static class DefaultHelloWorld implements HelloWorld {

        @Override
        public String helloWorld() {
            return "Hello World!";
        }
    }
}
