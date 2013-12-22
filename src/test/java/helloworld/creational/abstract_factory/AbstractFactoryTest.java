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
        assertThat(splitHelloWorldFactory.createHelloWorldObject().object(), is("Java"));
        assertThat(splitHelloWorldFactory.createHelloWorldInterjection().interjection(), is("Hello"));
        splitHelloWorldFactory = AbstractFactory.select(AbstractFactory.Type.DesignPattern);
        assertThat(splitHelloWorldFactory.createHelloWorldInterjection().interjection(), is("Hello"));
        assertThat(splitHelloWorldFactory.createHelloWorldObject().object(), is("Abstract Factory"));
    }

}
