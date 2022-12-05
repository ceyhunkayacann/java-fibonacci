import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = input.nextInt();

        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i <= number; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

        }
    }
}
