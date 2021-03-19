import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Simulation simulation=new Simulation();
        for (Rocket rocket: simulation.loadU1(simulation.loadItems("C:\\Users\\User\\Documents\\Phase-1.txt")))
        System.out.println(rocket);
    }
}
