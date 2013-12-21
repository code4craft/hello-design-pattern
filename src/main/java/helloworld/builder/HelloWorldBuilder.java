package helloworld.builder;

import helloworld.HelloWorld;
import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldBuilder {

    private String slogan;

    private String target;

    public static HelloWorldBuilder builder() {
        return new HelloWorldBuilder();
    }

    public HelloWorldBuilder slogan(String slogan) {
        this.slogan = slogan;
        return this;
    }

    public HelloWorldBuilder target(String target) {
        this.target = target;
        return this;
    }

    public HelloWorld getHelloWorld() {
        return new SplitHelloWorld(new SplitHelloWorld.HelloWorldSlogan() {
            @Override
            public String slogan() {
                return slogan;
            }
        }, new SplitHelloWorld.HelloWorldTarget() {
            @Override
            public String target() {
                return target;
            }
        });
    }

}
