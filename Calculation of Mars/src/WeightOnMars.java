import java.util.Scanner;
public class WeightOnMars {

        private static float earthWeightYours;
        private static float marsGravityPercentage = 38.0f;

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter your Earth weight: ");
            earthWeightYours = scanner.nextFloat();


            scanner.close();


            float marsWeightYours = earthWeightYours * (marsGravityPercentage / 100);


            double marsWeightDouble = marsWeightYours;


            System.out.printf("Mars Weight (double): %.4f\n", marsWeightDouble);


            int marsWeightInt = (int) marsWeightDouble;
            System.out.println("Mars Weight (int): " + marsWeightInt);


            char marsWeightChar = (char) marsWeightInt;
            System.out.println("Mars Weight (char): " + marsWeightChar);


            int resultInt = marsWeightChar + 10;
            System.out.println("Result of char + 10 (int): " + resultInt);
        }
    }



