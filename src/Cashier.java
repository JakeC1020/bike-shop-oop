import java.util.HashMap;

public class Cashier {
    private static double taxRate = .08;

    public double getBalanceDue(HashMap<Product, Integer> productsToBeBought) {
        double currentBalance = 0;
        for (Product product: productsToBeBought.keySet()) {
            double preTaxPrice = product.getPreTaxPrice();
            currentBalance += preTaxPrice*productsToBeBought.get(product);
        }
        return currentBalance + getTaxOwed(currentBalance);
    }

    private double getTaxOwed(double basePrice) {
        return taxRate*basePrice;
    }
}
