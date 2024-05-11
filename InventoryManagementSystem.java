import java.util.ArrayList;
import java.util.List;

public class InventoryManagementSystem 
{

    private List<Product> products = new ArrayList<>();

    // Create (Add) a product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Read (View) all products
    public void viewProducts() {
        products.forEach(System.out::println);
    }

    // Search product by id
    public Product searchProuctById(int id) 
    {
        for (Product p : products) {
            if (p.getId()==id) 
            {
                return p;
            }
        }
        return null;
    }

}