import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class U1 extends Rocket{
    public U1(int rocketCost, int rocketWeight, int currentWeight, int maxWeight, double launchExplosion, double landingSuccess) {
        super(rocketCost, rocketWeight,maxWeight,launchExplosion,landingSuccess,currentWeight);
        rocketCost=100000000;
        rocketWeight=10000;
        maxWeight=18000;
        launchExplosion=0.0;
        currentWeight=rocketWeight;
        landingSuccess=0.0;

    }
    @Override
    public boolean launch() {
        int randomNumber = (int) (Math.random()*100+1);
        /*try {
            File file = new File("C:\\Users\\User\\Documents\\Phase-1.txt");
            Scanner sca = new Scanner(file);
            while (sca.hasNextLine()) {
                String itemString = sca.nextLine();
                int position=itemString.indexOf("=");
                String name = itemString.substring(0, position);
                cargoLimit=maxWeight-rocketWeight;
                int weight = Integer.parseInt(itemString.substring(position+1));
                for (int i=0;i<=weight;i++) {
                    budget=weight;
                launchExplosion = 5.0*(weight)/(cargoLimit);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        launchExplosion=5.0*(currentWeight - rocketWeight) / (maxWeight - rocketWeight);
        System.out.println(currentWeight-rocketWeight);
        return launchExplosion<=randomNumber;
    }

    @Override
    public boolean land() {
        int randomNumber = (int) (Math.random()*100+1);
        landingSuccess = 1.0*(currentWeight-rocketWeight)/(maxWeight-rocketWeight);
        return landingSuccess<=randomNumber;
    }
}
