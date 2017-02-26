public abstract class Product {
    protected double costOfProduction;
    protected double preTaxPrice;
    protected String typeOfProduct;

    public double getCostOfProduction() {
        return costOfProduction;
    }

    public double getPreTaxPrice() {
        return preTaxPrice;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }
}
