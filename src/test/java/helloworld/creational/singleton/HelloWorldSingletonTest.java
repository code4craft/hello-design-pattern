package helloworld.creational.singleton;

import helloworld.HelloWorld;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldSingletonTest {

    @Test
    public void testHelloWorldSingleton(){
        HelloWorld helloWorld = HelloWorldSingleton.instance();
        assertThat(helloWorld.helloWorld(),is("Hello Singleton!"));
    }
}
