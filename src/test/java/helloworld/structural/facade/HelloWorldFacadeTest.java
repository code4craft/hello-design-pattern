package helloworld.structural.facade;

import helloworld.HelloWorld;
import helloworld.structural.decorator.HelloWorldDecorator;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldFacadeTest {

    @Test
    public void testHelloWorldFacade(){
        HelloWorld facadeHelloWorld = HelloWorldFacade.instance().facadeHelloWorld();
        assertThat(facadeHelloWorld.helloWorld(),is("Hello Facade!"));
    }
}
