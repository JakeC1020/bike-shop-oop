import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class BikeShop {
    private Inventory inventory;
    private Cashier cashier = new Cashier();

    public static void main(String [] args) {


    }

    public void purchaseItemsInShoppingCart() {
        double totalBalance = cashier.getBalanceDue(inventory.getShoppingCart());
        System.out.println("---Items Being Purchased");
        inventory.showShoppingCart();
        System.out.println("Total Payed: $" + totalBalance);

        inventory.clearShoppingCart();
    }

    public void printMenuOptions() {
        System.out.println("---Bike Shop---");
        System.out.println("1 - List Items in Shop");
        System.out.println("2 - Add Item to Cart");
        System.out.println("3 - List Items in Cart");
        System.out.println("4 - Checkout");
        System.out.println("5 - Exit");
    }

    public void initializeInventory() {
        HashMap<Product, Integer> products = new HashMap<>();

        File file = new File("sample_data.txt");
        try {
            Scanner scanner = new Scanner(file).useDelimiter(",");
            while (scanner.hasNextLine()) {
                String productType = scanner.next();
                Integer numberOfProduct = scanner.nextInt();
                Object product = Class.forName(productType).newInstance();
                products.put((Product) product, numberOfProduct);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        inventory = new Inventory(products);
    }
}
