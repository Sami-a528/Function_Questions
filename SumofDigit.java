import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int digit = sc.nextInt();
        System.out.println("The Sum is "+ sumDigits(digit));
        sc.close();
    }
    public static int sumDigits(int n) {
        int sumofDigits = 0;
        while (n>0) {
            int lastDigit = n%10;
            sumofDigits = sumofDigits+lastDigit;
            n = n/10;
        }
        return sumofDigits;
    }
}
