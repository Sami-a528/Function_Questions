public class FuncOverlo {
    public static int Mul(int a, int b) {
        return a*b;
    }
    public static int Mul(int a, int b, int c) {
        return a*b*c;
    }
    public static void main(String[] args) {
       System.out.println(Mul(4, 9)); 
       System.out.println(Mul(5, 7, 9));
    }
}
