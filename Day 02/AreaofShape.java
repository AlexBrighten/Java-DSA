import java.util.Scanner;

public class AreaofShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape to find the area of it: ");
        String shape = sc.next().toLowerCase();

        switch (shape) {
            case "circle":
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                double areaCircle = Math.PI * Math.pow(r, 2);
                System.out.printf("The area of the Circle = %.2f\n", areaCircle);
                break;

            case "triangle":
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double areaTriangle = 0.5 * base * height;
                System.out.printf("The area of the Triangle = %.2f\n", areaTriangle);
                break;

            case "rectangle":
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                double areaRectangle = length * breadth;
                System.out.printf("The area of the Rectangle = %.2f\n", areaRectangle);
                break;

            default:
                System.out.println("Enter a valid name of the shape.");
        }

        sc.close();
    }
}
