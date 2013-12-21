package helloworld.creational.prototype;

import helloworld.HelloWorld;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldPrototypeTest {

    @Test
    public void testHelloWorldPrototype(){
        HelloWorld helloWorld = HelloWorldPrototype.PROTOTYPE.clone();
        assertThat(helloWorld.helloWorld(),is("Hello Prototype!"));
    }
}
