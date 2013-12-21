package helloworld.creational.abstract_factory;

import helloworld.creational.abstract_factory.AbstractFactory;
import helloworld.creational.abstract_factory.SplitHelloWorldFactory;
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
        assertThat(splitHelloWorldFactory.createHelloWorldSlogan().slogan(), is("Hello"));
        splitHelloWorldFactory = AbstractFactory.select(AbstractFactory.Type.DesignPattern);
        assertThat(splitHelloWorldFactory.createHelloWorldSlogan().slogan(), is("Hello"));
        assertThat(splitHelloWorldFactory.createHelloWorldTarget().target(), is("Abstract Factory"));
    }

}
