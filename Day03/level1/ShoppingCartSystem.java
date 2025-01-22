class Product{
    static int discount;
    String productName;
    int price,quantity;
    final int productId = 179;

    Product(String productName,int price, int quantity, int discount){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.discount=discount;
    }
    static void updateDiscount(){
        //this.discount=discount;
    discount+=10;
    }

    void displayProductDetails(){
        System.out.println("Product Name : "+productName);
        System.out.println("Price : "+price+"rs");
        System.out.println("Quantity : "+quantity);
        System.out.println("Updated Discount : "+ discount+"%");
    }
}
public class ShoppingCartSystem{
    public static void main(String[] args) {
        Product p1=new Product("Peanut Butter",599,2,6);
        Product.updateDiscount();

        System.out.println("Is object is an instance of the Product class? "+(p1 instanceof Product));
        p1.displayProductDetails();
        
    }
}