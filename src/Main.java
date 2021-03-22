public class Main {
    public static void main(String[] args) {
        Simulation simulation=new Simulation();
        Rocket rocket1 = new Rocket();
        rocket1.land();
        rocket1.launch();
        for (Rocket rocket: simulation.loadU1(simulation.loadItems("C:\\Users\\User\\Documents\\Phase-1.txt")))
        System.out.println("Here is the rocket format "+rocket);
    }
}
