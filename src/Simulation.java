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

    public ArrayList<Rocket> runSimulation(ArrayList<Rocket> rockets) { //The list of rockets that you passed into this method, you didn't use it for anything. Why?
        //This method does not do anything at all other than returning the rockets that you passed to it
        //From the project question,
        //runSimulation: this method takes an ArrayList of Rockets and calls launch and land methods for each of the rockets in the ArrayList.
        //Every time a rocket explodes or crashes (i.e if launch or land return false) it will have to send that rocket again.
        //All while keeping track of the total budget required to send each rocket safely to Mars.
        //runSimulation then returns the total budget required to send all rockets (including the crashed ones).
        //so it's supposed to return total budget not rockets


        Rocket rocket=new Rocket();
        if (!rocket.launch())  rocket.launch();
        if (!rocket.land()) rocket.land();
        return rockets;

//        Remove everything from line 63 to 66 and use the one below

//        int numOfTrials = 0;
//        for (Rocket rocket : rockets) {
//            while (!rocket.launch()) {
//                rocket.launch();
//                numOfTrials++;
//            }
//
//            while (!rocket.land()) {
//                rocket.land();
//                numOfTrials++;
//            }
//        }
//        int budget = rockets.get(0).cost * (rockets.size() + numOfTrials);
//        return budget;
    }

}
