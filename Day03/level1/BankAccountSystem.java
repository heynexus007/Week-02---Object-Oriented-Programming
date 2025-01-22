class BankAccount{
    static String name="Luffy";
    String accountHolderName;
    static int totalAccount;
    final int accountNumber;
    
    BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccount++;
    }

    static void getTotalAccount(){
        System.out.println("total number of account : "+totalAccount);
    }
}
public class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount bAccount1= new BankAccount("arlong", 4675);
        System.out.println(" Is account object is an instance of the BankAccount class? "+ (bAccount1 instanceof BankAccount));
        bAccount1.getTotalAccount();
        System.out.println("-------------------------------");
        BankAccount bAccount2= new BankAccount("arlong", 4675);
        System.out.println(" Is account object is an instance of the BankAccount class? "+ (bAccount2 instanceof BankAccount));
        bAccount2.getTotalAccount();
    }
}