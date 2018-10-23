package mx.sintelti.spring.tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesterMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Tester tester = applicationContext.getBean("tester", Tester.class); //spring crea los objetos en vez de nostros
        tester.test();

    }
}
