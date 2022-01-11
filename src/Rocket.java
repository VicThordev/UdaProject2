 class Rocket implements SpaceShip {
    int rocketCost;
    int rocketWeight;
    int maxWeight;
    double launchExplosion;
    double landingSuccess;
    int currentWeight;
     int budget;
     int cargoLimit;

     public Rocket(int rocketCost, int rocketWeight, int maxWeight, double launchExplosion, double landingSuccess, int currentWeight) {
         this.rocketCost = rocketCost;
         this.rocketWeight = rocketWeight;
         this.maxWeight = maxWeight;
         this.launchExplosion = launchExplosion;
         this.landingSuccess = landingSuccess;
         this.currentWeight = currentWeight;
     }

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
         return currentWeight + item.weight <= maxWeight;
     }

     @Override
     public int carry(Item item) {
         currentWeight+=item.weight;
         return currentWeight;
     }
 }
