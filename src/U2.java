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
        try {
            File file = new File("C:\\Users\\User\\Documents\\Phase-20.txt");
            Scanner sca = new Scanner(file);
            while (sca.hasNextLine()) {
                String itemString = sca.nextLine();
                int position=itemString.indexOf("=");
                int weight = Integer.parseInt(itemString.substring(position+1));
                for (int i=0;i<=weight;i++) {
                    landingSuccess = 8.0*(weight)/(maxWeight-rocketWeight);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return landingSuccess<=randomNumber;
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
                int weight = Integer.parseInt(itemString.substring(position+1));
                for (int i=0;i<weight;i++) {
                    budget+=weight;
                    launchExplosion = 4.0*(weight)/(maxWeight-rocketWeight);
                }
                System.out.println(budget);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return launchExplosion<=randomNumber;
    }
}
