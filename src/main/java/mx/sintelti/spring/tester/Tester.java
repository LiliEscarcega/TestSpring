package mx.sintelti.spring.tester;
import org.springframework.stereotype.Component;
@Component("tester")
public class Tester {
    private Device device;
    public void test(){
        device.play();
        device.stop();
        device.turnOff();
        device.turnOn();
    }
    public void setDevice(Device device) {
        this.device = device;
    }
}
