import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Simulation sim = new Simulation();
        ArrayList<Item> arr = sim.loadItems("C:\\Users\\User\\Documents\\Phase-1.txt");
        ArrayList<Rocket> arrLoad = sim.loadU1(arr);
        System.out.println("The total budget is $"+sim.runSimulation(arrLoad));
    }
}
