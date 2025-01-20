import java.util.Scanner;
class BankAccount{
    private String accountHolder;
    private int accountNumber;
    private int balance  ;
    int curBalance;
    
    // Constructor 
    BankAccount(String accountHolder, int accountNumber, int balance){
        // reference the variable outsit 
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    // method for desposit amount
    void depositMoney(int amount){
        curBalance=balance+amount;
    }
    // method for desposit amount
    void withdraw(int amount){
        if(curBalance>amount && curBalance>0)
        curBalance-=amount;

        else
        System.out.println("Insuffiencient Balance!!!");
    }
    // method for displaying details
    void displayBalance(){  
        System.out.println("Your current Balance is :"+ curBalance);
    }
}
public class AtmMachine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        BankAccount b= new BankAccount("Anonymos",2344574,60000);
        System.out.print("Enter Deposit amount: ");
        int depositAmt=input.nextInt();
        System.out.print("Enter Withdraw amount: ");
        int withdraw=input.nextInt();

        //Calling method deposit & withdraw amount
        b.depositMoney(depositAmt);
        b.withdraw(withdraw);
        b.displayBalance();

        //Closing scanner
        input.close();
    }
}
