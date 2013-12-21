package helloworld.structural.adapter;

import helloworld.HelloWorld;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldAdapterTest {

    @Test
    public void testHelloWorldAdapter(){
        HelloWorld adapterHelloWorld = new HelloWorldAdapter(new HelloAdapterDesignPattern());
        assertThat(adapterHelloWorld.helloWorld(),is("Hello Adapter!"));
    }
}
