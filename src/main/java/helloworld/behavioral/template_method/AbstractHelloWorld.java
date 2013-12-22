package helloworld.behavioral.template_method;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public abstract class AbstractHelloWorld implements HelloWorld{

    @Override
    public String helloWorld() {
        StringBuffer accum = new StringBuffer();
        accum.append(getInterjection());
        accum.append(getSeparator());
        accum.append(getObject());
        accum.append(getTerminator());
        return accum.toString();
    }

    public abstract String getInterjection();

    public abstract String getSeparator();

    public abstract String getObject();

    public abstract String getTerminator();
}
