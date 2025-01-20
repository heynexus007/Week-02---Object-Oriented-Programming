import java.util.Scanner;
class PalindromeChecker{
    String text;
    //Constructor
    PalindromeChecker(String text){
        this.text=text;
    }
    //Method for plaindrome check
    boolean isPalindrome(String text){
        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Text : ");
        String text=input.next();
        // creating object for class PalindromeChecker
        PalindromeChecker check= new PalindromeChecker(text);
        System.out.println("Text is palindrome? "+ check.isPalindrome(text));

        //closing scanner obj
        input.close();
    }
}
