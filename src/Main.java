import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Simulation sim = new Simulation();
        ArrayList<Item> arr = sim.loadItems("C:\\Users\\User\\Documents\\Phase-1.txt");
        ArrayList<Item> arr1 = sim.loadItems("C:\\Users\\User\\Documents\\Phase-20.txt");
        ArrayList<Rocket> arrLoad = sim.loadU1(arr);
        ArrayList<Rocket> arrLoad1 = sim.loadU2(arr1);
        System.out.println("The total budget for the first rocket is $"+sim.runSimulation(arrLoad));
        System.out.println("The total budget for the second rocket is $"+sim.runSimulation(arrLoad1));
    }
}
