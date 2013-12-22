package helloworld.behavioral.template_method;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author yihua.huang@dianping.com
 */
public class TemplateMethodHelloWorldTest {

    @Test
    public void testTemplateMethodHelloWorld(){
        TemplateMethodHelloWorld templateMethodHelloWorld = new TemplateMethodHelloWorld();
        assertThat(templateMethodHelloWorld.helloWorld(),is("Hello Template Method!"));
    }
}
