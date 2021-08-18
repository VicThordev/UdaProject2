
public class Main {
    public static void main(String[] args) {
        double finalBudget;
        double totalBudget;
        Simulation simulation=new Simulation();
        for (Rocket rocket: simulation.runSimulation(simulation.loadU1(simulation.loadItems("C:\\Users\\User\\Documents\\Phase-1.txt"))))
            if (rocket.launch()) {
                finalBudget=rocket.launchExplosion*rocket.rocketCost;
                totalBudget= rocket.rocketCost+finalBudget;
                System.out.println( rocket.budget+" tonnes is the total weight(cargo) carried by the rocket.");
                System.out.println(rocket.cargoLimit+" tonnes is the limit of the rocket");
                System.out.println(rocket.launchExplosion +"% is the percentage probability of exploding. " +
                        "This is the final budget $"+ totalBudget);
            } else rocket.launch();
    }
}
