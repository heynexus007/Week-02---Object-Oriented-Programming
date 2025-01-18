class Product {
    // Instance variables
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Constructor -> Parameterized
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products when a product is added
    }

    // Instance method to display productDetails
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs " + price);
    }

    // Class method to display total no. products
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}

public class ProductInventory{
    public static void main(String[] args) {
        // Creating object of Product class for access methods
        Product item1 = new Product("IQ00 Neo 6 Pro",38999 );
        item1.displayProductDetails();  // call instance display method
        Product.displayTotalProducts(); // call by class variable display method
    }
}