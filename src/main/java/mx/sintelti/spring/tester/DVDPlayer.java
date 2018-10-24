package mx.sintelti.spring.tester;
import org.springframework.stereotype.Component;
@Component("tester")
public class DVDPlayer implements Device{

    public void turnOn () {
        System.out.println("DVDPlayer encendido");

    }
    public void play (){
        System.out.println("DVDPlayer reproduciedo");

    }
    public void stop (){
        System.out.println("DVDPlayer en pausa");

    }
    public void turnOff (){
        System.out.println("DVDPlayer apagado");

    }
}
