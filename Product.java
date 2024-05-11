public class Product {
    private int id;
    private String pname;
    private int price;

    public Product(int id, String pname, int price) {
        this.id = id;
        this.pname = pname;
        this.price = price;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pname;
    }

    public void setpName(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Prouct Name: " + pname + ", Price: " + price;
    }
}