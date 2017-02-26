import java.util.HashMap;

public class Inventory {
    private HashMap<Product, Integer> productsOnFloor;
    private HashMap<Product, Integer> shoppingCart;

    public Inventory(HashMap<Product, Integer> products) {
        productsOnFloor = products;
        shoppingCart = new HashMap<>();
    }

    public void addToCart(Product product) {
        productsOnFloor.put(product, productsOnFloor.get(product) + 1);
        shoppingCart.put(product, shoppingCart.get(product) - 1);

    }

    public void removeFromCart(Product product) {
        shoppingCart.put(product, shoppingCart.get(product) + 1);
        productsOnFloor.put(product, productsOnFloor.get(product) - 1);
    }

    public void clearShoppingCart() {
        shoppingCart.clear();
    }

    public void showInventory() {
        for (Product productOnFloor: productsOnFloor.keySet()) {
            String typeOfProduct = productOnFloor.getTypeOfProduct();
            Integer numberOfProduct = productsOnFloor.get(productOnFloor);
            System.out.println( typeOfProduct + " - " + numberOfProduct);
        }
    }

    public void showShoppingCart() {
        for (Product productInCart: shoppingCart.keySet()) {
            String typeOfProduct = productInCart.getTypeOfProduct();
            Integer numberOfProduct = shoppingCart.get(productInCart);
            System.out.println( typeOfProduct + " - " + numberOfProduct);
        }
    }

    public HashMap<Product, Integer> getProductsOnFloor() {
        return productsOnFloor;
    }

    public HashMap<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }


}
