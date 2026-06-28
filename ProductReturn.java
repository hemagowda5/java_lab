class Product {

    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}

public class ProductReturn {

    static Product createProduct() {
        return new Product("Laptop", 65000);
    }

    public static void main(String[] args) {

        Product p = createProduct();

        System.out.println("Product Name : " + p.productName);
        System.out.println("Price        : " + p.price);
    }
}
