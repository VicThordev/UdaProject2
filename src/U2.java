import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U2 extends Rocket {
    public U2() {
        rocketCost=120;
        rocketWeight=18;
        currentWeight=rocketWeight;
        maxWeight=29;
        launchExplosion=0.0;
        landingSuccess=0.0;
    }

    @Override
    public boolean launch() {
        int randomNumber = (int) (Math.random()*100+1);
        landingSuccess = 8.0*(currentWeight-rocketWeight)/(maxWeight-rocketWeight);
        return launchExplosion<=randomNumber;
    }

    @Override
    public boolean land() {
        int randomNumber = (int) (Math.random()*100+1);
        landingSuccess=1.0*(currentWeight-rocketWeight)/(maxWeight-rocketWeight);
        return launchExplosion<=randomNumber;
    }
}
