package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by Pablo on 19/9/2017.
 */

public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
        System.out.println(obj.getMessage());
    }
}
