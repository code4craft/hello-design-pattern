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
        HelloWorldFactory helloWorldFactory = AbstractFactory.javaFactory();
        assertThat(helloWorldFactory.createHelloWorldTarget().target(), is("Java"));
        assertThat(helloWorldFactory.createHelloWorldSlogan().slogan(), is("Hello world"));
        helloWorldFactory = AbstractFactory.designPatternFactory();
        assertThat(helloWorldFactory.createHelloWorldSlogan().slogan(), is("Hello world"));
        assertThat(helloWorldFactory.createHelloWorldTarget().target(), is("Abstract Factory"));
    }

}
