import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
        int randomNumber = (int) (Math.random()*100+1);
        try {
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
        }
        return launchExplosion<=randomNumber;
    }

    @Override
    public boolean land() {
        int randomNumber = (int) (Math.random()*100+1);
        try {
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
                    landingSuccess = 1.0*(weight)/(cargoLimit);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return landingSuccess<=randomNumber;
    }
}
