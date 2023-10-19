import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();


        if (a == 0) {
            System.out.println("Coefficient 'a' must be non-zero for a quadratic equation.");
            return;
        }

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();


        double delta = b * b - 4 * a * c;


        int numberOfRoots;

        if (delta > 0) {
            numberOfRoots = 2;
        } else if (delta == 0) {
            numberOfRoots = 1;
        } else {
            numberOfRoots = 0;
        }


        switch (numberOfRoots) {
            case 2:
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Two distinct real roots:\n x1 = %.2f\n x2 = %.2f\n", x1, x2);
                break;

            case 1:
                double root = -b / (2 * a);
                System.out.printf("One real root:\n x = %.2f\n", root);
                break;

            case 0:
                System.out.println("No real roots. The roots are complex.");
                break;
        }
    }
}
