 class Rocket implements SpaceShip {
    int rocketCost;
    int rocketWeight;
    int maxWeight;
    double launchExplosion;
    double landingSuccess;
    int currentWeight;
     int budget;
     int cargoLimit;



     @Override
     public boolean launch() {
         return true;
     }

     @Override
     public boolean land() {
         return true;
     }

     @Override
     public boolean canCarry(Item item) {
         return currentWeight + item.getWeight() <= maxWeight;
     }

     @Override
     public int carry(Item item) {
         currentWeight+=item.getWeight();
         return currentWeight;
     }
 }
