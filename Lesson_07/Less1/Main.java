package Less1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("", "", 1.99);
        product1.name = "Apple";
        product1.brand = "Apple";
        product1.price = 1.99;
        
        Product product2 = new Product(null);
        product2.name = "Orange";
        product2.brand = "Orange";
        product2.price = 0.99;
    }
}
