package helloworld.behavioral.mediator;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldMediatorTest {

    @Test
    public void testHelloWorldMediator(){
        HelloWorldInterjection helloWorldInterjection = new HelloWorldInterjection();
        HelloWorldObject helloWorldObject = new HelloWorldObject();
        HelloWorldMediator helloWorldMediator = new HelloWorldMediator(helloWorldInterjection,helloWorldObject);
        helloWorldInterjection.setHelloWorldMediator(helloWorldMediator);
        helloWorldObject.setHelloWorldMediator(helloWorldMediator);
        assertThat(helloWorldInterjection.helloWorld(),is("Hello Mediator!"));
        assertThat(helloWorldObject.helloWorld(),is("Hello Mediator!"));
    }
}
