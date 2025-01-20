import java.util.Scanner;
class MobilePhone{
String brand;
String model;
int price;

//Constructor
MobilePhone(String brand, String model, int price){
    this.brand=brand;
    this.model=model;
    this.price=price;
}

// display method 
void displayItem(){
    System.out.println("Mobile brand : "+ brand);
    System.out.println("Mobile model : "+ model);
    System.out.println("Mobile Price : "+price);
}
}
public class MobileDetails {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Creating item class object
        MobilePhone m1=new MobilePhone("Nokia","Gen1",2000);
        m1.displayItem();
        System.out.println();

        //Closing scanner obj
        input.close();

    }
}
