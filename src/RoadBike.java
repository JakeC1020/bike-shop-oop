public class RoadBike extends Bike {
    public RoadBike() {
        costOfProduction = 80;
        preTaxPrice = 120;
        material = Material.CARBON;
        numSpeeds = 27;
        typeOfProduct = "Road Bike";
    }
    public RoadBike(double costOfProduction, double preTaxPrice, Material material, int numSpeeds) {
        this.costOfProduction = costOfProduction;
        this.preTaxPrice = preTaxPrice;
        this.material = material;
        this.numSpeeds = numSpeeds;
        this.typeOfProduct = "Road Bike";
    }
}
