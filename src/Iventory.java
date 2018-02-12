import java.util.HashMap;
import java.util.Map;

/**
 * Created by haosun on 2/10/18.
 */
public class Iventory {
    private Map<Integer, Product> productMap;

    public Iventory() {
        productMap = new HashMap<>();
    }

    /**
     * utility functions
     */
    @Override
    public String toString() {
        String s = "Iventory List:\n";
        for (Product p : productMap.values()) {
            s += p.toString() + "\n";
        }
        return s;
    }

    public void addProduct(int ID, String name, double price, int quantity) {
        if (productMap.containsKey(ID)) {
            System.out.println("Product ID already exists!");
            return;
        }
        Product newp = new Product(ID, name, price, quantity);
        productMap.put(ID, newp);
        System.out.println(newp);
    }

    public void removeProduct(int ID) {
        if (!productMap.containsKey(ID)) {
            System.out.println("Product ID doesn't exist!");
            return;
        }
        productMap.remove(ID);
        System.out.println("Product ID: " + ID + " removed successfully!");
    }

    public void changePrice(int ID, double newPrice) {
        if (!productMap.containsKey(ID)) {
            System.out.println("Product ID doesn't exist!");
            return;
        }
        if (newPrice <= 0.0d) {
            System.out.println("Price should be positive");
            return;
        }
        Product product = productMap.get(ID);
        product.setPrice(newPrice);
        System.out.println(product);
    }

    public void changeQuantity(int ID, int diff) {
        if (!productMap.containsKey(ID)) {
            System.out.println("Product ID doesn't exist!");
            return;
        }
        Product product = productMap.get(ID);
        product.changeQuantity(diff);
        System.out.println(product);
    }

    public void queryProduct(int ID) {
        if (!productMap.containsKey(ID)) {
            System.out.println("Product ID doesn't exist!");
            return;
        }
        System.out.println(productMap.get(ID));
    }

    public void iventoryTotalPrice() {
        double total = 0.0d;
        for (Product p : productMap.values()) {
            total += p.productTotalPrice();
        }
        System.out.println("Iventory Total Price : " + total);
    }
}
