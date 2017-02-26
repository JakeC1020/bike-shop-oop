public class MountainBike extends Bike {
    public MountainBike() {
        costOfProduction = 60;
        preTaxPrice = 80;
        material = Material.STEEL;
        numSpeeds = 21;
        typeOfProduct = "Mountain Bike";
    }
    public MountainBike(double costOfProduction, double preTaxPrice, Material material, int numSpeeds) {
        this.costOfProduction = costOfProduction;
        this.preTaxPrice = preTaxPrice;
        this.material = material;
        this.numSpeeds = numSpeeds;
        this.typeOfProduct = "Mountain Bike";
    }
}
