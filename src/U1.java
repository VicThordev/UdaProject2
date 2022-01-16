import java.util.Random;

public class U1 extends Rocket{
    public U1() {
        rocketCost=100000000;
        rocketWeight=10000;
        maxWeight=18000;
        launchExplosion=0.0;
        currentWeight=rocketWeight;
        landingSuccess=0.0;

    }
    @Override
    public boolean launch() {
        Random random = new Random();
        int randomNumber = random.nextInt();

        launchExplosion=5.0*(currentWeight - rocketWeight) / (maxWeight - rocketWeight);
        return launchExplosion<=randomNumber;
    }

    @Override
    public boolean land() {
        Random random = new Random();
        int randomNumber = random.nextInt();
        landingSuccess = 1.0*(currentWeight-rocketWeight)/(maxWeight-rocketWeight);
        return landingSuccess<=randomNumber;
    }
}
