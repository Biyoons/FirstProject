import java.util.Scanner;

public class NumberSystemConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Choose what operation you want to perform:");
            System.out.println("A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println("W. Exit the program");
            System.out.print("Enter your choice: ");

            choice = scanner.next().toUpperCase();

            switch (choice) {
                case "A":
                    System.out.print("Enter a number: ");
                    String number = scanner.next();
                    int decimal = convertToDecimal(number);
                    System.out.println("Decimal representation: " + decimal);
                    break;
                case "B":
                    System.out.print("Enter a decimal number: ");
                    int decimalNumber = scanner.nextInt();
                    System.out.print("Enter the base to convert to (3, 4, 5, 6, 8, 9, 10, or hexadecimal): ");
                    String base = scanner.next().toLowerCase();
                    String convertedNumber = convertFromDecimal(decimalNumber, base);
                    System.out.println("Converted number: " + convertedNumber);
                    break;
                case "C":
                    System.out.print("Enter the first number: ");
                    String firstNumber = scanner.next();
                    System.out.print("Enter the second number: ");
                    String secondNumber = scanner.next();
                    System.out.print("Enter the base for the result (3, 4, 5, 6, 8, 9, 10, or hexadecimal): ");
                    String resultBase = scanner.next().toLowerCase();
                    int result = addNumbers(firstNumber, secondNumber, resultBase);
                    System.out.println("Result: " + result);
                    break;
                case "D":
                    System.out.print("Enter the first number: ");
                    String firstNum = scanner.next();
                    System.out.print("Enter the second number: ");
                    String secondNum = scanner.next();
                    System.out.print("Enter the base for the result (3, 4, 5, 6, 8, 9, 10, or hexadecimal): ");
                    String subtractionBase = scanner.next().toLowerCase();
                    int resultSubtraction = subtractNumbers(firstNum, secondNum, subtractionBase);
                    System.out.println("Result: " + resultSubtraction);
                    break;
                case "E":
                    System.out.print("Enter the first number: ");
                    String num1 = scanner.next();
                    System.out.print("Enter the second number: ");
                    String num2 = scanner.next();
                    System.out.print("Enter the base for the result (3, 4, 5, 6, 8, 9, 10, or hexadecimal): ");
                    String multiplicationBase = scanner.next().toLowerCase();
                    int resultMultiplication = multiplyNumbers(num1, num2, multiplicationBase);
                    System.out.println("Result: " + resultMultiplication);
                    break;
                case "F":
                    System.out.print("Enter the first number: ");
                    String number1 = scanner.next();
                    System.out.print("Enter the second number: ");
                    String number2 = scanner.next();
                    System.out.print("Enter the base for the result (3, 4, 5, 6, 8, 9, 10, or hexadecimal): ");
                    String divisionBase = scanner.next().toLowerCase();
                    int resultDivision = divideNumbers(number1, number2, divisionBase);
                    System.out.println("Result: " + resultDivision);
                    break;
                case "W":
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("W"));
    }

    // Function to convert a number from any base to decimal
    static int convertToDecimal(String number) {
        int base = 0;
        // Check the base of the number
        if (number.startsWith("0x") || number.startsWith("0X")) {
            base = 16; // Hexadecimal
            number = number.substring(2);
        } else if (number.startsWith("0")) {
            base = 8; // Octal
            number = number.substring(1);
        } else if (number.matches("[01]+")) {
            base = 2; // Binary
        } else if (number.matches("[0-9]+")) {
            base = 10; // Decimal
        } else {
            base = number.length(); // Custom base
        }

        int decimal = Integer.parseInt(number, base);
        return decimal;
    }

    // Function to convert a decimal number to another base
    static String convertFromDecimal(int decimal, String base) {
        int targetBase = 0;
        switch (base) {
            case "3":
                targetBase = 3;
                break;
            case "4":
                targetBase = 4;
                break;
            case "5":
                targetBase = 5;
                break;
            case "6":
                targetBase = 6;
                break;
            case "8":
                targetBase = 8;
                break;
            case "9":
                targetBase = 9;
                break;
            case "10":
                targetBase = 10;
                break;
            case "hexadecimal":
                targetBase = 16;
                break;
            default:
                return "Invalid base.";
        }

        return Integer.toString(decimal, targetBase);
    }

    // Function to add two numbers in the specified base
    static int addNumbers(String num1, String num2, String base) {
        int n1 = convertToDecimal(num1);
        int n2 = convertToDecimal(num2);
        return n1 + n2;
    }

    // Function to subtract two numbers in the specified base
    static int subtractNumbers(String num1, String num2, String base) {
        int n1 = convertToDecimal(num1);
        int n2 = convertToDecimal(num2);
        return n1 - n2;
    }

    // Function to multiply two numbers in the specified base
    static int multiplyNumbers(String num1, String num2, String base) {
        int n1 = convertToDecimal(num1);
        int n2 = convertToDecimal(num2);
        return n1 * n2;
    }

    // Function to divide two numbers in the specified base
    static int divideNumbers(String num1, String num2, String base) {
        int n1 = convertToDecimal(num1);
        int n2 = convertToDecimal(num2);
        if (n2 == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return n1 / n2;
    }
}