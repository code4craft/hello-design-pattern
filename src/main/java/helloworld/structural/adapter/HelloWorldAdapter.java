package helloworld.structural.adapter;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldAdapter implements HelloWorld{

    private HelloDesignPattern helloDesignPattern;

    public HelloWorldAdapter(HelloDesignPattern helloDesignPattern) {
        this.helloDesignPattern = helloDesignPattern;
    }

    @Override
    public String helloWorld() {
        return helloDesignPattern.helloDesignPattern();
    }
}
