package mx.sintelti.spring.tester;
import org.springframework.stereotype.Component;
@Component("tester")

public class BlueRay implements Device{
    public void turnOn () {
        System.out.println("BlueRay encendido BlueRay");

    }
    public void play (){
        System.out.println("BlueRay reproduciedo BlueRay");

    }
    public void stop (){
        System.out.println("BlueRay en pausa BlueRay");

    }
    public void turnOff (){
        System.out.println("BlueRay apagado Blueray");

    }
}
