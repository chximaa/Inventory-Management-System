import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n-- Inventory Management System --");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = s.nextInt();
            s.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = s.nextInt();
                    s.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = s.nextLine();

                    System.out.print("Enter Category: ");
                    String category = s.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = s.nextInt();

                    System.out.print("Enter Price: ");
                    double price = s.nextDouble();

                    Product product = new Product(id, name, category, quantity, price);
                    inventory.addProduct(product);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = s.nextInt();
                    inventory.removeProduct(removeId);
                    System.out.println("Product removed successfully!");
                    break;

                case 3:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = s.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = s.nextInt();
                    inventory.updateQuantity(updateId, newQuantity);
                    System.out.println("Quantity updated successfully!");
                    break;

                case 4:
                if(inventory.isEmpty()){
                    System.out.println("\nNo products to be displayed");
                }else{ 
                    System.out.println("\n     --- Product List ---");
                    inventory.display();
                    }
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    s.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
