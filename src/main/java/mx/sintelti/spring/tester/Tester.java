package mx.sintelti.spring.tester;

public class Tester {

    public void testDvd(DVDPlayer dvdPlayer) {
        dvdPlayer.turnOn();
        dvdPlayer.turnOff();
        dvdPlayer.stop();
        dvdPlayer.play();
    }
    public void testMp3(Mp3Player testerMp3Player){
        testerMp3Player.apaga();
        testerMp3Player.enciende();
        testerMp3Player.pausa();
        testerMp3Player.reproduce();

    }
    public void blueRay (BlueRay blueRay){
        blueRay.apaga();
        blueRay.enciende();
        blueRay.pausa();
        blueRay.reproduce();
    }

}
