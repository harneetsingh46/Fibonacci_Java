import java.util.Scanner;

public class Fibbonacci {
     static void fibo(int n) {
        if (n <= 0) {
            System.out.println("Please enter number greater than 0.");
        } else {
            int a = 0, b = 1, c;

            System.out.print(a + " " + b);

            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.print(" " + c);

                a = b;
                b = c;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        fibo(n);
    }
}
