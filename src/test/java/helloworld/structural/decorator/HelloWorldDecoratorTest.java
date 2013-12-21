package helloworld.structural.decorator;

import helloworld.HelloWorld;
import helloworld.structural.composite.CompositeHelloWorld;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyString;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldDecoratorTest {

    @Test
    public void testHelloWorldDecorator(){
        HelloWorldDecorator helloWorldDecorator = new HelloWorldDecorator(new HelloWorldDecorator.DefaultHelloWorld());
        assertThat(helloWorldDecorator.helloWorld(),is("Hello World!"));
        assertThat(helloWorldDecorator.helloDecorator(),is("Hello Decorator!"));
        helloWorldDecorator = new HelloWorldDecorator(helloWorldDecorator);
        assertThat(helloWorldDecorator.helloWorld(),is("Hello World!"));
    }
}
