package helloworld.structural.flyweight;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldFlyWeight implements HelloWorld {

    private final String value;

    public HelloWorldFlyWeight(String value) {
        this.value = value;
    }

    @Override
    public String helloWorld() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HelloWorldFlyWeight that = (HelloWorldFlyWeight) o;

        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
