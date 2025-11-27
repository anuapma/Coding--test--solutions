
class Calculator {

    public double calculate(double a, double b, String operation) {

        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) return Double.NaN; // handle division by zero
                return a / b;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second num…
		System.out.println("Hello World!");
	}
}
