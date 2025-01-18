import java.util.Scanner;

class item {
    int itemCode;
    String itemName;
    int price;

    // Constructor
    item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Calculate method
    public void calculate(int quantity) {
        price *= quantity;
        System.out.println("Total cost : " + price);
    }

    // display method
    void displayItem() {
        System.out.println("Item code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Item Price : " + price);
    }
}

public class TrackInventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creating item class object
        item i = new item(01, "Gen1", 1200);
        i.displayItem();
        System.out.println();
        // Taking quantity
        System.out.print("Enter Quantity : ");
        int quantity = input.nextInt();
        // Calling
        i.calculate(quantity);

        // Closing scanner obj
        input.close();

    }
}
