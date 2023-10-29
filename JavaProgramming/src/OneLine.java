import java.util.Scanner;

class OneLine {
        private double length;
        private double width;
        private double area;

        public OneLine() {
            getData();
            computeArea();
            displayInfo();
        }

        private void displayInfo() {

                System.out.println("Rectangle Information:");
                System.out.println("Length: " + length);
                System.out.println("Width: " + width);
                System.out.println("Area: " + area);

        }

        private void getData() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the length of the rectangle: ");
            length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            width = scanner.nextDouble();
            scanner.close();
        }

        private void computeArea() {
            area = length * width;
        }


    }

