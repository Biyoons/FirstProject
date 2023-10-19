import java.util.Scanner;
public class BMICalculator {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your height (in m): ");
            float height = scanner.nextFloat();

            System.out.print("Enter your weight (in kg): ");
            float weight = scanner.nextFloat();


            float bmi = weight / (float) Math.pow(height, 2);


            String category;
            if (bmi < 16.00) {
                category = "Starvation";
            } else if (bmi >= 16.00 && bmi <= 16.99) {
                category = "Emaciation";
            } else if (bmi >= 17.00 && bmi <= 18.49) {
                category = "Underweight";
            } else if (bmi >= 18.50 && bmi <= 22.99) {
                category = "Normal, low range";
            } else if (bmi >= 23.00 && bmi <= 24.99) {
                category = "Normal, high range";
            } else if (bmi >= 25.00 && bmi <= 27.49) {
                category = "Overweight, low range";
            } else if (bmi >= 27.50 && bmi <= 29.99) {
                category = "Overweight, high range";
            } else if (bmi >= 30.00 && bmi <= 34.9) {
                category = "1st degree obesity";
            } else if (bmi >= 35.00 && bmi <= 39.9) {
                category = "2nd degree obesity";
            } else {
                category = "3rd degree obesity";
            }


            System.out.println("\nBMI: " + bmi);
            System.out.println("Category: " + category);

            scanner.close();
        }
    }


