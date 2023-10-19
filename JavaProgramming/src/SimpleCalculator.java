import java.util.Scanner;
public class SimpleCalculator {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the first number: ");
            float firstNumberBielecki = scanner.nextFloat();


            System.out.print("Enter the second number: ");
            float secondNumberBielecki = scanner.nextFloat();


            scanner.close();


            float sum = firstNumberBielecki + secondNumberBielecki;
            float difference = firstNumberBielecki - secondNumberBielecki;
            float product = firstNumberBielecki * secondNumberBielecki;


            float quotient = secondNumberBielecki != 0 ? firstNumberBielecki / secondNumberBielecki : Float.NaN;


            System.out.printf("Sum: %.2f%n", sum);
            System.out.printf("Difference: %.2f%n", difference);
            System.out.printf("Product: %.2f%n", product);


            if (!Float.isNaN(quotient)) {
                System.out.printf("Quotient: %.2f%n", quotient);
            } else {
                System.out.println("Cannot divide by zero. Quotient is undefined.");
            }
        }
    }


