public class U1 extends Rocket{
    @Override
    public boolean launch() {
        int randomNumber = (int) (Math.random()*100+1);
        launchExplosion = 5.0*(currentWeight -rocketWeight)/(maxWeight-rocketWeight);
        return launchExplosion<=randomNumber;
    }

    @Override
    public boolean land() {
        int randomNumber = (int) (Math.random()*100+1);
        landingSuccess = 1.0*(currentWeight -rocketWeight)/(maxWeight-rocketWeight);
        return landingSuccess<=randomNumber;
    }
}
