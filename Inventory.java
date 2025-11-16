import java.util.ArrayList;
public class Inventory{
    private ArrayList<Product> products;

    public Inventory(){
        products = new ArrayList<>();
    }

    // add a product
    public void addProduct(Product product){
        products.add(product);
    }

    //remove a product
    public void removeProduct(int id){
        products.removeIf(p -> p.getId() == id);
    }

    //update a product
    public void updateQuantity(int id, int newQuantity){
        for(Product p : products){
            if(p.getId() == id){
                p.setQuantity(newQuantity);
                break;
            }
        }
    }


    // display all products
    public void display(){
        for(Product p : products){
            System.out.println(p);
        }
    }

    public boolean isEmpty(){
        return products.isEmpty();
    }


}