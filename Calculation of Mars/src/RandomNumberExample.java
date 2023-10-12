import java.util.Random;

public class RandomNumberExample {
    public static void main(String[] args) {

        int randomNumber = generateRandomNumber();


        System.out.println("Generated Random Number: " + randomNumber);


        if (randomNumber % 2 == 0) {
            System.out.println(randomNumber + " is an even number.");
        } else {
            System.out.println(randomNumber + " is an odd number.");
        }
    }


    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
