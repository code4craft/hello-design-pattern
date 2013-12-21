package helloworld.abstract_factory;

/**
 * @author yihua.huang@dianping.com
 */
public class AbstractFactory {

   public static HelloWorldFactory factory(){
       return new DesignPatternHelloWorldFactory();
   }

}
