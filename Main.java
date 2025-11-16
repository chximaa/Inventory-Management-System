import java.util.Scanner;

public class Main {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n-- Inventory Management System --");
            System.out.println("1. Add Product & Supplier");
            System.out.println("2. Remove Product");
            System.out.println("3. Remove Supplier");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Display Products");
            System.out.println("6. Display Suppliers");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = s.nextInt();
            s.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // Product input
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
                    s.nextLine();

                    // Supplier input
                    System.out.print("Enter Supplier ID: ");
                    int supId = s.nextInt();
                    s.nextLine();

                    System.out.print("Enter Supplier Name: ");
                    String supName = s.nextLine();

                    System.out.print("Enter Supplier Contact: ");
                    String supContact = s.nextLine();

                    Supplier supplier = new Supplier(supId, supName, supContact);
                    inventory.addSupplier(supplier);

                    Product product = new Product(id, name, category, quantity, price, supplier);
                    inventory.addProduct(product);

                    System.out.println("Product and Supplier added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = s.nextInt();
                    inventory.removeProduct(removeId);
                    System.out.println("Product removed successfully!");
                    break;

                case 3:
                    System.out.print("Enter Supplier ID to remove: ");
                    int removeSupp = s.nextInt();
                    inventory.removeSupplier(removeSupp);
                    System.out.println("Supplier removed successfully!");
                    break;

                case 4:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = s.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = s.nextInt();
                    inventory.updateQuantity(updateId, newQuantity);
                    System.out.println("Quantity updated successfully!");
                    break;

                case 5:
                    System.out.println("\n--- Product List ---");
                    inventory.displayProducts();
                    break;

                case 6:
                    System.out.println("\n--- Supplier List ---");
                    inventory.displaySuppliers();
                    break;

                case 7:
                    System.out.println("Exiting... Goodbye!");
                    s.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
