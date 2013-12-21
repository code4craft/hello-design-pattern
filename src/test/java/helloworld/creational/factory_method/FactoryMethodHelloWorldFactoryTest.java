package helloworld.creational.factory_method;

import helloworld.HelloWorld;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class FactoryMethodHelloWorldFactoryTest {

    @Test
    public void testFactoryMethodHelloWorldFactory(){
        HelloWorldFactory helloWorldFactory = new HelloWorldFactory();
        HelloWorld helloWorld = helloWorldFactory.createHelloWorld();
        assertThat(helloWorld.helloWorld(),is("Hello World!"));
        FactoryMethodHelloWorldFactory factoryMethodHelloWorldFactory = new FactoryMethodHelloWorldFactory();
        helloWorld = factoryMethodHelloWorldFactory.createHelloWorld();
        assertThat(helloWorld.helloWorld(),is("Hello Factory Method!"));
    }
}
