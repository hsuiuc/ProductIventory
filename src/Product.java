/**
 * Created by haosun on 2/10/18.
 * Product class to store product information
 */
public class Product {
    private int ID;
    private String name;
    private double price;
    private int quantity;

    /**
     * constructors
     */
    public Product() {
        ID = -1;
        name = "blank product";
        price = 0.0d;
        quantity = 0;
    }

    public Product(int ID, String name, double price, int quantity) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    public Product(int ID, String name) {
        this.ID = ID;
        this.name = name;
        price = 0.0d;
        quantity = 0;
    }

    /**
     *utility functions
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void changeQuantity(int diff) {
        this.quantity += diff;
    }

    @Override
    public String toString() {
        return "ID : " + ID + " Name : " + name + " Price : " +
                price + " Quantity : " + quantity + " Total Price : " +
                productTotalPrice();
    }

    /**
     * total price of a product
     * @return total price
     */
    public double productTotalPrice() {
        return price * quantity;
    }
}
