package helloworld.abstract_factory;

import helloworld.HelloWorld;
import helloworld.builder.HelloWorldBuilder;
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
                .slogan("Hello")
                .target("Builder").getHelloWorld();
        assertThat(builderHelloWorld.helloWorld(),is("Hello Builder!"));

        HelloWorld helloWorld = HelloWorldBuilder.builder()
                .slogan("Hello")
                .target("World").getHelloWorld();
        assertThat(helloWorld.helloWorld(),is("Hello World!"));
    }
}
