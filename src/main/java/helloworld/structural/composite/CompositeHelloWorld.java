package helloworld.structural.composite;

import helloworld.HelloWorld;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yihua.huang@dianping.com
 */
public class CompositeHelloWorld implements HelloWorld {

    private List<HelloWorld> helloWorlds;

    private String lineSeparator = System.getProperty("line.separator");

    public CompositeHelloWorld(HelloWorld... helloWorlds) {
        this.helloWorlds = Arrays.asList(helloWorlds);
    }

    @Override
    public String helloWorld() {
        List<String> helloWorldOuts = new ArrayList<String>();
        for (HelloWorld helloWorld : helloWorlds) {
            helloWorldOuts.add(helloWorld.helloWorld());
        }
        return StringUtils.join(helloWorldOuts, lineSeparator);
    }

    public static class DefaultHelloWorld implements HelloWorld{

        @Override
        public String helloWorld() {
            return "Hello Composite!";
        }
    }
}
