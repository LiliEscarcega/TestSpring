package mx.sintelti.spring.tester;

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
