package mx.sintelti.spring.tester;

public class Mp3Player  implements Device {
    public void turnOn () {
        System.out.println("Mp3Player encendido mp3");

    }
    public void play (){
        System.out.println("Mp3Player reproduciedo mp3");

    }
    public void stop (){
        System.out.println("Mp3Player en pausa mp3");

    }
    public void turnOff (){
        System.out.println("Mp3Player apagado mp3");

    }


}
