package helloworld.behavioral.strategy;

/**
 * @author yihua.huang@dianping.com
 */
public class JavaHelloWorldStrategy implements HelloWorldStrategy{
    @Override
    public String helloWorld() {
        return "Hello Java!";
    }
}
