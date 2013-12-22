package helloworld.behavioral.iterator;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldIteratorTest {

    @Test
    public void testHelloWorldIterator(){
        final String helloIterator = "Hello Iterator!";
        HelloWorldCharacterIterator helloWorldCharacterIterator = new HelloWorldCharacterIterator(helloIterator.toCharArray());
        StringBuffer stringBuffer = new StringBuffer();
        while (helloWorldCharacterIterator.hasNext()){
            stringBuffer.append(helloWorldCharacterIterator.next());
        }
        assertThat(stringBuffer.toString(),is(helloIterator));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testHelloWorldIteratorRemove(){
        final String helloIterator = "Hello Iterator!";
        HelloWorldCharacterIterator helloWorldCharacterIterator = new HelloWorldCharacterIterator(helloIterator.toCharArray());
        helloWorldCharacterIterator.remove();
    }
}
