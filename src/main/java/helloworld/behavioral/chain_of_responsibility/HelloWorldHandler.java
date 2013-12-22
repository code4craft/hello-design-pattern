package helloworld.behavioral.chain_of_responsibility;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public abstract class HelloWorldHandler implements HelloWorld {

    private HelloWorldHandler next;

    public HelloWorldHandler setNext(HelloWorldHandler next) {
        this.next = next;
        return this;
    }

    public abstract void handle(StringBuffer stringBuffer);

    @Override
    public String helloWorld() {
        StringBuffer stringBuffer = new StringBuffer();
        handle(stringBuffer);
        if (next != null) {
            next.handle(stringBuffer);
        }
        return stringBuffer.toString();
    }
}
