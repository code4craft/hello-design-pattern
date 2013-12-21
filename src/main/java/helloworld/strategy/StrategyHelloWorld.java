package helloworld.strategy;

/**
 * @author yihua.huang@dianping.com
 */
public class StrategyHelloWorld {

    static enum Strategy {
        Java, DesignPattern;
    }

    static interface StategySelectable {

        public Strategy getStategy();

    }
}
