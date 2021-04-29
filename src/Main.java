
public class Main {
    public static void main(String[] args) {
        double finalBudget=0;
        double totalBudget=0;
        Simulation simulation=new Simulation();
        for (Rocket rocket: simulation.runSimulation(simulation.loadU1(simulation.loadItems("C:\\Users\\User\\Documents\\Phase-1.txt"))))
            if (rocket.land()) {
                finalBudget=rocket.landingSuccess* rocket.rocketCost;
                totalBudget= rocket.rocketCost-finalBudget;
                System.out.println(rocket.landingSuccess +" This is the final budget "+ totalBudget);
            }
    }
}
