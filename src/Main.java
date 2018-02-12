import java.util.Scanner;

/**
 * Created by haosun on 2/11/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Iventory stock = new Iventory();
        boolean quitFlag = true;

        String qId = "Enter the product id: ";
        String qName = "Enter the product name: ";
        String qPrice = "Enter the product price: ";
        String qQty = "Enter the product quantity: ";

        System.out.println("Welcome to inventory app v1.0");

        while (quitFlag) {
            System.out.println("What do you want to do?");
            System.out.println("\n    Enter 1 to add new product.");
            System.out.println("    Enter 2 to remove product.");
            System.out.println("    Enter 3 to change price.");
            System.out.println("    Enter 4 to change quantity.");
            System.out.println("    Enter 5 to query product.");
            System.out.println("    Enter 6 to get iventory total value.");
            System.out.println("    Enter 7 to print iventory.");
            System.out.println("    Enter \"q\" to quit the application.");

            System.out.print(">>");
            String res = reader.nextLine();

            System.out.println();
            int ID = 0;
            String name = "blank product";
            double price = 0.0d;
            int quantity = 0;
            switch (res) {
                case "1":
                    ID = getID(reader, qId);
                    name = getName(reader, qName);
                    price = getPrice(reader, qPrice);
                    quantity = getQuantity(reader, qQty);
                    stock.addProduct(ID, name, price, quantity);
                    break;
                case "2":
                    ID = getID(reader, qId);
                    stock.removeProduct(ID);
                    break;
                case "3":
                    ID = getID(reader, qId);
                    price = getPrice(reader, qPrice);
                    stock.changePrice(ID, price);
                    break;
                case "4":
                    ID = getID(reader, qId);
                    quantity = getQuantity(reader, qQty);
                    stock.changeQuantity(ID, quantity);
                    break;
                case "5":
                    ID = getID(reader, qId);
                    stock.queryProduct(ID);
                    break;
                case "6":
                    stock.iventoryTotalPrice();
                    break;
                case "7":
                    System.out.println(stock);
                    break;
                case "q":
                    quitFlag = false;
                    break;
            }
        }
    }

    public static int getID(Scanner scanner, String qID) {
        System.out.println(qID);
        int ID = -1;

        while (true) {
            try {
                ID = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Try again!");
                System.out.println(qID);
            }
        }
        return ID;
    }

    public static String getName(Scanner scanner, String qName) {
        System.out.println(qName);
        return scanner.nextLine();
    }

    public static double getPrice(Scanner scanner, String qPrice) {
        System.out.println(qPrice);
        double price = 0.0d;

        while (true) {
            try {
                price = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Try again!");
                System.out.println(qPrice);
            }
        }
        return price;
    }

    public static int getQuantity(Scanner scanner, String qQuantity) {
        System.out.println(qQuantity);
        int quantity = 0;

        while (true) {
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Try again!");
                System.out.println(qQuantity);
            }
        }
        return quantity;
    }
}
