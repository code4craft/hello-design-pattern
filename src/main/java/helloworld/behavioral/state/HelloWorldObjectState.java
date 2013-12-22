package helloworld.behavioral.state;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldObjectState implements HelloWorldState{
    @Override
    public void append(HelloWorldStateContext helloWorldStateContext, String word) {
        helloWorldStateContext.append(word).append("!").setState(new HelloWorldFinalizedState());
    }
}
