import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;
    private ArrayList<Supplier> suppliers;

    public Inventory() {
        products = new ArrayList<>();
        suppliers = new ArrayList<>();
    }

    // Add product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove product
    public void removeProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    // Update quantity
    public void updateQuantity(int id, int newQuantity) {
    if (products.isEmpty()) {
        System.out.println("Inventory is empty!\nUnable to make changes!");
        return;
    }

    boolean found = false;
    for (Product p : products) {
        if (p.getId() == id) {
            p.setQuantity(newQuantity);
            found = true;
            System.out.println("Quantity updated successfully!");
            break;
        }
    }

    if (!found) {
        System.out.println("Product with ID " + id + " not found!");
    }
}


    // Add supplier
    public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    // Display products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products to display.");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }

    // Display suppliers
    public void displaySuppliers() {
        if (suppliers.isEmpty()) {
            System.out.println("No suppliers to display.");
            return;
        }
        for (Supplier s : suppliers) {
            System.out.println(s);
        }
    }

    public void removeSupplier(int id){
        suppliers.removeIf(s->s.getsId()==id);
    }

    // Check if product list is empty
    public boolean isEmpty() {
        return products.isEmpty();
    }
}
