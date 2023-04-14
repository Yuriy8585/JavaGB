package Less1;

public class Product {
    String name;
    String brand;
    double price;

    public Product(String name) {
        this(name, "", 0.0);
        
    }

    public Product(String inputName, String brand, double price) {
        this.name = inputName;
        this.brand = brand;
        this.price = price;
    }

    
/*Получаем информацию по продукту */
    String displayInfo(){
        return String.format("Name: %s, Brand: %s, Price: %.2f", name, brand, price);
    }

}
