import java.util.Random;

public class FindMinMaxWhileLoop {
    public static void main(String[] args) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        int iterations = 10;


        Random random = new Random();


        int count = 0;


        while (count < iterations) {

            int randomNumber = random.nextInt(100) + 1;


            if (randomNumber > largest) {
                largest = randomNumber;
            }


            if (randomNumber < smallest) {
                smallest = randomNumber;
            }


            count++;
        }


        System.out.println("Randomly drawn numbers;");
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
