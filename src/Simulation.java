import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public ArrayList<Item> loadItems(String filename) {
        ArrayList<Item> itemList = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner sca = new Scanner(file);
            while (sca.hasNextLine()) {
                String itemString = sca.nextLine();
                int position=itemString.indexOf("=");
                String name = itemString.substring(0, position);
                int weight = Integer.parseInt(itemString.substring(position+1));
                Item item = new Item(name, weight);
                itemList.add(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
    }
        return itemList;
}

public ArrayList<Rocket> loadU1(ArrayList<Item> itemArrayList) {
    ArrayList<Rocket> loadRocket = new ArrayList<>();
    Rocket rocket = new U1();
    for (Item item : itemArrayList) {
        while (!(rocket.canCarry(item))) {
            loadRocket.add(rocket);
            rocket = new U1();
        }
        rocket.canCarry(item);
    }
    loadRocket.add(rocket);
    return loadRocket;
}
    public ArrayList<Rocket> loadU2(ArrayList<Item> itemArrayList) {
        ArrayList<Rocket> loadRocket=new ArrayList<>();
        Rocket rocket = new U2();
        for (Item item:itemArrayList) {
            while (!rocket.canCarry(item)) {
                loadRocket.add(rocket);
                rocket = new U2();
            }
            rocket.carry(item);
        }
        loadRocket.add(rocket);
        return loadRocket;
    }

    public int runSimulation(ArrayList<Rocket> rockets) {
        int numOfTrials =0;
        for (Rocket rocket : rockets) {
            while (!rocket.launch()) {
                rocket.launch();
                numOfTrials++;
            }
            while (!rocket.land()) {
                rocket.land();
                numOfTrials++;
            }
        }
        int budget= rockets.get(0).rocketCost*(rockets.size()+numOfTrials);
        return budget;
    }

}
