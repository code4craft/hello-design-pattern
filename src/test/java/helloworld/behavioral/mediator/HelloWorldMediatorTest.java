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
        HelloWorldInterjection helloWorldSlogan = new HelloWorldInterjection();
        HelloWorldObject helloWorldTarget = new HelloWorldObject();
        HelloWorldMediator helloWorldMediator = new HelloWorldMediator(helloWorldSlogan,helloWorldTarget);
        helloWorldSlogan.setHelloWorldMediator(helloWorldMediator);
        helloWorldTarget.setHelloWorldMediator(helloWorldMediator);
        assertThat(helloWorldSlogan.helloWorld(),is("Hello Mediator!"));
        assertThat(helloWorldTarget.helloWorld(),is("Hello Mediator!"));
    }
}
