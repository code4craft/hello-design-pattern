package helloworld.behavioral.state;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldStateContextTest {

    @Test
    public void testHelloWorldStateContext(){
        HelloWorldStateContext helloWorldStateContext = new HelloWorldStateContext();
        helloWorldStateContext.appendWord("Hello");
        assertThat(helloWorldStateContext.helloWorld(),is("Hello "));
        helloWorldStateContext.appendWord("State");
        assertThat(helloWorldStateContext.helloWorld(),is("Hello State!"));
        helloWorldStateContext.appendWord("Whatever");
        assertThat(helloWorldStateContext.helloWorld(),is("Hello State!"));
    }
}
