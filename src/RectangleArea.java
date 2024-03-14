
    import java.util.Scanner;

    // RectangleArea class for logic of the program
    class RectangleArea {
         double length;
         double width;
         double area;

        // Method to get side lengths from the user
        public RectangleArea getData() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the length of the rectangle: ");
            length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            width = scanner.nextDouble();
            scanner.close();
            return this;
        }

        // Method to compute the area
        public RectangleArea computeField() {
            area = length * width;
            return this;
        }

        // Method to display info and result
        public void fieldDisplay() {
            System.out.println("Length: " + length);
            System.out.println("Width: " + width);
            System.out.println("Area: " + area);
        }
    }


