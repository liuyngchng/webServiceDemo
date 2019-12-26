package example;


import mypackage.HelloWorld;
import mypackage.HelloWorldService;

public class HelloWorldClient {
    public static void main(String[] argv) {
        HelloWorld service = new HelloWorldService().getHelloWorldPort();
        //invoke business method
        String result = service.sayHelloWorldFrom("who am i");
        System.out.println(result);
  }
}
