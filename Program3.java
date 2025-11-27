import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        System.out.println("Odd numbers up to " + x + ":");

        for (int i = 1; i <= x; i += 2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}