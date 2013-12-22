package helloworld.behavioral.state;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldInterjectionState implements HelloWorldState {
    @Override
    public void append(HelloWorldStateContext helloWorldStateContext, String word) {
        helloWorldStateContext.append(word).append(" ").setState(new HelloWorldObjectState());
    }
}
