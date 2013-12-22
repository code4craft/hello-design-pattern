package helloworld.behavioral.template_method;

/**
 * @author yihua.huang@dianping.com
 */
public class TemplateMethodHelloWorld extends AbstractHelloWorld{
    @Override
    public String getInterjection() {
        return "Hello";
    }

    @Override
    public String getSeparator() {
        return " ";
    }

    @Override
    public String getObject() {
        return "Template Method";
    }

    @Override
    public String getTerminator() {
        return "!";
    }
}
