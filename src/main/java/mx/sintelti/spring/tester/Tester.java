package mx.sintelti.spring.tester;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.beans.factory.annotation.Qualifier;
@Component("tester")
public class Tester {
    private Device device;
    public void test(){
        device.play();
        device.stop();
        device.turnOff();
        device.turnOn();
    }
    @Autowired
    @Qualifier("mp3Player")
    public void setDevice(Device device) {
        this.device = device;
    }
}
