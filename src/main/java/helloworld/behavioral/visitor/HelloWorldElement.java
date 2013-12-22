package helloworld.behavioral.visitor;

/**
 * @author yihua.huang@dianping.com
 */
public interface HelloWorldElement {

    public void accept(HelloWorldVisitor visitor);
}
