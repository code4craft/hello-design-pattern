package helloworld.structural.adapter;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldAdapter implements HelloWorld{

    private HelloAdapterDesignPattern helloDesignPattern;

    public HelloWorldAdapter(HelloAdapterDesignPattern helloDesignPattern) {
        this.helloDesignPattern = helloDesignPattern;
    }

    @Override
    public String helloWorld() {
        return helloDesignPattern.helloDesignPattern();
    }
}
