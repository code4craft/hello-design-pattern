package helloworld.behavioral.strategy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldStrategyContextTest {

    @Test
    public void testHelloWorldStrategyContext(){
        HelloWorldStrategyContext helloWorldStrategyContext = new HelloWorldStrategyContext(new JavaHelloWorldStrategy());
        assertThat(helloWorldStrategyContext.helloWorld(),is("Hello Java!"));
        helloWorldStrategyContext = new HelloWorldStrategyContext(new DesignPatternHelloWorldStrategy());
        assertThat(helloWorldStrategyContext.helloWorld(),is("Hello Strategy!"));
    }
}
