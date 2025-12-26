import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int polin = sc.nextInt();

        if(isPalindrome(polin)){
            System.out.println("Number"+polin+"is a Polindrome");
        }else{
            System.out.println("Number"+polin+"is not a Polindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(int number) {
        int Polin = number;
        int reverse = 0;

        while (Polin!=0) {
            int remainder = Polin%10;
            reverse = reverse*10+remainder;
            Polin = Polin/10;
        }
        if (number==reverse) {
            return true;
        }else{
            return false;
        }
    }
}
