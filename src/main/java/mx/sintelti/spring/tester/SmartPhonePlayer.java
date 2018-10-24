package mx.sintelti.spring.tester;
import org.springframework.stereotype.Component;
@Component("tester")

public class SmartPhonePlayer implements Device {

    public void turnOn () {
        System.out.println("SmartPhonePlayer encendido");

    }
    public void play (){
        System.out.println("SmartPhonePlayer reproduciedo");

    }
    public void stop (){
        System.out.println("SmartPhonePlayer en pausa");

    }
    public void turnOff (){
        System.out.println("SmartPhonePlayer apagado");

    }

}
