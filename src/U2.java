public class U2 extends Rocket {
    @Override
    public boolean launch() {
        int randomNumber = (int) (Math.random()*100+1);
        landingSuccess = 8.0*(currentWeight - rocketWeight)/(maxWeight-rocketWeight);
        return landingSuccess<=randomNumber;
    }

    @Override
    public boolean land() {
        int randomNumber = (int) (Math.random()*100+1);
        launchExplosion = 4.0*(currentWeight - rocketWeight)/(maxWeight-rocketWeight);
        return launchExplosion<=randomNumber;
    }
}
