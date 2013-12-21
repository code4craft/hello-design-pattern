package helloworld.abstract_factory;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class AbstractFactoryTest {

    @Test
    public void testHelloWorld() throws InstantiationException, IllegalAccessException {
        SplitHelloWorldFactory splitHelloWorldFactory = AbstractFactory.select(AbstractFactory.Type.Java);
        assertThat(splitHelloWorldFactory.createHelloWorldTarget().target(), is("Java"));
        assertThat(splitHelloWorldFactory.createHelloWorldSlogan().slogan(), is("Hello world"));
        splitHelloWorldFactory = AbstractFactory.select(AbstractFactory.Type.DesignPattern);
        assertThat(splitHelloWorldFactory.createHelloWorldSlogan().slogan(), is("Hello world"));
        assertThat(splitHelloWorldFactory.createHelloWorldTarget().target(), is("Abstract Factory"));
    }

}
