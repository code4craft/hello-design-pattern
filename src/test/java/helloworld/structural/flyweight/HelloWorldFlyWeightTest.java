package helloworld.structural.flyweight;

import helloworld.HelloWorld;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldFlyWeightTest {

    @Test
    public void testHelloWorldFlyWeight(){
        HelloWorld helloWorld = HelloWorldFlyWeightFactory.instance().createHelloWorld("Hello Flyweight!");
        assertThat(helloWorld.helloWorld(),is("Hello Flyweight!"));
        helloWorld = HelloWorldFlyWeightFactory.instance().createHelloWorld("Hello Flyweight!");
        assertThat(helloWorld.helloWorld(),is("Hello Flyweight!"));
    }
}
