import java.util.Scanner;

public class multiple {
    public static int PrintMultiple(int a, int b, int c) {
        int mul = a*b*c;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc. nextInt();
        int c = sc.nextInt();
        int mul = PrintMultiple(a, b, c);
        System.out.println("The Multiplication is="+ mul);
        sc.close();
    }
}
