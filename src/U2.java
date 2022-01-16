import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class U2 extends Rocket {
    public U2() {
        rocketCost=120000000;
        rocketWeight=18000;
        currentWeight=rocketWeight;
        maxWeight=29000;
        launchExplosion=0.0;
        landingSuccess=0.0;
    }


    @Override
    public boolean launch() {
        Random random = new Random();
        int randomNumber = random.nextInt();
        landingSuccess = 8.0*(currentWeight-rocketWeight)/(maxWeight-rocketWeight);
        return launchExplosion<=randomNumber;
    }

    @Override
    public boolean land() {
        Random random = new Random();
        int randomNumber = random.nextInt();
        landingSuccess=1.0*(currentWeight-rocketWeight)/(maxWeight-rocketWeight);
        return launchExplosion<=randomNumber;
    }
}
