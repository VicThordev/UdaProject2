public class U1 extends Rocket{
    public U1() {
        rocketCost=100;
        rocketWeight=10;
        maxWeight=18;
        launchExplosion=0.0;
        currentWeight=rocketWeight;
        landingSuccess=0.0;
    }
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
