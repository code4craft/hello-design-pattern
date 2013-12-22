package helloworld.behavioral.memento;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldMementoTest {

    @Test
    public void testHelloWorldMediator(){
        HelloWorldMementoOriginator helloWorldMementoOriginator = new HelloWorldMementoOriginator();
        HelloWorldMementoOriginator.Memento memento = helloWorldMementoOriginator.set("Hello Memento!").saveToMemento();
        helloWorldMementoOriginator.set("Hello Whatever!");
        assertThat(helloWorldMementoOriginator.helloWorld(), is("Hello Whatever!"));
        helloWorldMementoOriginator.restoreFromMemento(memento);
        assertThat(helloWorldMementoOriginator.helloWorld(),is("Hello Memento!"));
    }
}
