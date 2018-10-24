package mx.sintelti.spring.tester;
import org.springframework.stereotype.Component;
@Component("tester")
public class Mp3Player  implements Device {
    private PlayList playList;
    public void turnOn () {
        System.out.println("Mp3Player encendido mp3");

    }
    public void play (){
        System.out.println("Mp3Player reproduciedo mp3 con la play list = " + playList.getName());

    }
    public void stop (){
        System.out.println("Mp3Player en pausa mp3");

    }
    public void turnOff (){
        System.out.println("Mp3Player apagado mp3");

    }

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }
}
