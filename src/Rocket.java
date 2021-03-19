 class Rocket implements SpaceShip {
    int rocketCost;
    int rocketWeight;
    int maxWeight;
    double launchExplosion;
    double landingSuccess;
    int currentWeight;

     @Override
     public boolean launch() {
         return launch();
     }

     @Override
     public boolean land() {
         return land();
     }

     @Override
     public boolean canCarry(Item item) {
         if (canCarry(item)) return true;
         return false;
     }

     @Override
     public int carry(Item item) {
         return currentWeight+=rocketWeight;
     }
 }
