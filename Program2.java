import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("First " + x + " odd numbers:");

        for (int i = 1; i <= x * 2; i += 2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}