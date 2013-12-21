package helloworld.abstract_factory;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class AbstractFactoryTest {

    @Test
    public void testHelloWorld(){
        HelloWorldFactory helloWorldFactory = new JavaHelloWorldFactory();
        assertThat(helloWorldFactory.createHelloWorld().helloWorld(), is("Hello world, Java!"));
        helloWorldFactory = new DesignPatternHelloWorldFactory();
        assertThat(helloWorldFactory.createHelloWorld().helloWorld(), is("Hello world, Abstract Factory!"));
    }

}
