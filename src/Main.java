
public class Main {
    public static void main(String[] args) {
        Simulation simulation=new Simulation();
        simulation.runSimulation(simulation.loadU1(simulation.loadItems("C:\\Users\\User\\Documents\\Phase-1.txt")));
        for (Rocket rocket: simulation.runSimulation(simulation.loadU1(simulation.loadItems("C:\\Users\\User\\Documents\\Phase-1.txt"))))
            System.out.println("Here is the rocket format "+rocket);
    }
}
