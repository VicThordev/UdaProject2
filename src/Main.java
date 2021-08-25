
public class Main {
    public static void main(String[] args) {
        //You don't need all this long story here
        //You're supposed to have done majority of the work in the runSimulation() method of simulation class
        //The only thing that should happen here is for you to print the output of runSimulation() which is the total budget
        //READ the instruction below and do that after you have fixed the comments I indicated in the other classes

        //Run the simulation using the fleet of U1 rockets and display the total budget required
        //Repeat the same for U2 rockets and display the total budget for that.
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
