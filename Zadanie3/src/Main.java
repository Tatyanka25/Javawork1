import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner z3 = new Scanner(System.in);
        System.out.print("x: ");
        int x = z3.nextInt();
        System.out.print("n: ");
        int n = z3.nextInt();
        z3.close();
        boolean negative = n < 0;
        if (negative) n *= -1;
        double result = 1;
        // int i = 1;
        // while (i <= n) {
        //     result *= x;2
        //     i++;
        // }
        for (int i = 1; i <= n; i=i+1) result *= x;
        if (negative) result = 1 / result;
        System.out.println(result);
    }
}