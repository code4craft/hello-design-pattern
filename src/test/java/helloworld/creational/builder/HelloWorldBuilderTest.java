package helloworld.creational.builder;

import helloworld.HelloWorld;
import helloworld.creational.builder.HelloWorldBuilder;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldBuilderTest {

    @Test
    public void testHelloWorldBuilder(){
        HelloWorld builderHelloWorld = HelloWorldBuilder.builder()
                .interjection("Hello")
                .object("Builder").getHelloWorld();
        assertThat(builderHelloWorld.helloWorld(),is("Hello Builder!"));

        HelloWorld helloWorld = HelloWorldBuilder.builder()
                .interjection("Hello")
                .object("World").getHelloWorld();
        assertThat(helloWorld.helloWorld(),is("Hello World!"));
    }
}
