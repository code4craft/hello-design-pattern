package helloworld.structural.composite;

import helloworld.HelloWorld;
import helloworld.structural.bridge.DesignPatternWorldImpl;
import helloworld.structural.bridge.HelloWorldBridge;
import helloworld.structural.bridge.JavaHelloWorldImpl;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyString;

/**
 * @author yihua.huang@dianping.com
 */
public class CompositeHelloWorldTest {

    @Test
    public void testCompositeHelloWorld(){
        HelloWorld emptyCompositeHelloWorld = new CompositeHelloWorld();
        assertThat(emptyCompositeHelloWorld.helloWorld(),isEmptyString());
        HelloWorld compositeHelloWorld = new CompositeHelloWorld(new CompositeHelloWorld.DefaultHelloWorld());
        assertThat(compositeHelloWorld.helloWorld(),is("Hello Composite!"));
    }
}
