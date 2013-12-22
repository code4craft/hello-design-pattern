package helloworld.behavioral.chain_of_responsibility;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldHandlerTest {

    @Test
    public void testHelloWorldHandler(){
        HelloWorldHandler helloWorldChainOfResponsibility = new HelloWorldInterjectionHandler().setNext(new HelloWorldObjectHandler());
        assertThat(helloWorldChainOfResponsibility.helloWorld(),is("Hello Chain of Responsibility!"));
    }
}
