public class Product {

    private int id;
    private String name;
    private String category;
    private int quantity;
    private double price;
    private Supplier supplier;

    public Product(int id, String name, String category, int quantity, double price, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.supplier = supplier;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
    public Supplier getSupplier() { return supplier; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + category + " | Qty: " + quantity + " | " + price + "$";
    }
}
