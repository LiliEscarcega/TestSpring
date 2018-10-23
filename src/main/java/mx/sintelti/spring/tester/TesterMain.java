package mx.sintelti.spring.tester;

public class TesterMain {
    public static void main(String[] args) {
        Tester tester = new Tester();
        DVDPlayer dvdPlayer = new DVDPlayer();
        tester.testDvd(dvdPlayer);

        Mp3Player testerMp3Player = new Mp3Player();
        tester.testMp3(testerMp3Player);

        BlueRay blueRay = new BlueRay();
        tester.blueRay(blueRay);


    }
}
