import java.util.Random;

public class LegoContainerExample {
    public static void main(String[] args) {

        int amountOfBricks = generateOddNumber(50, 100);


        int containerCapacity = generateEvenNumber(5, 10);


        System.out.println("Number of Lego Bricks: " + amountOfBricks);
        System.out.println("Container Capacity: " + containerCapacity);


        int fullContainers = amountOfBricks / containerCapacity;


        int totalContainers = (int) Math.ceil((double) amountOfBricks / containerCapacity);


        int remainingBlocks = amountOfBricks % containerCapacity;


        System.out.println("Number of Full Containers: " + fullContainers);
        System.out.println("Total Number of Containers: " + totalContainers);
        System.out.println("Blocks in the Partially Full Container: " + remainingBlocks);
    }


    private static int generateOddNumber(int min, int max) {
        Random random = new Random();
        int number = random.nextInt((max - min + 1) / 2) * 2 + min;
        return number;
    }


    private static int generateEvenNumber(int min, int max) {
        Random random = new Random();
        int number = random.nextInt((max - min + 1) / 2) * 2 + min + 1;
        return number;
    }
}
