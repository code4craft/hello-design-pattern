package helloworld.structural.bridge;

import helloworld.HelloWorld;
import helloworld.structural.adapter.HelloAdapterDesignPattern;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldBridgeTest {

    @Test
    public void testHelloWorldAdapter(){
        HelloWorld bridgeHelloWorld = new HelloWorldBridge(new JavaHelloWorldImpl());
        assertThat(bridgeHelloWorld.helloWorld(),is("Hello Java!"));
        bridgeHelloWorld = new HelloWorldBridge(new DesignPatternWorldImpl());
        assertThat(bridgeHelloWorld.helloWorld(),is("Hello Bridge!"));
    }
}
