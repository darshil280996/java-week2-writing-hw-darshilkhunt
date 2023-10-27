package homework_week2;

/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class Programme_14_AreaAndPerimeter {
    // Calculating area and perimeter of rectangle

    public static void areaAndPerimeterOfRectangle(int height, int width) {
        int perimeter = 2 * (height + width);
        int area = (height * width);
        System.out.println("The area of rectangle is: " + area);
        System.out.println("The perimeter of rectangle is: " + perimeter);
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of Rectangle: ");
        int height = scanner.nextInt();
        System.out.println("Enter height of Rectangle: ");
        int width = scanner.nextInt();
        areaAndPerimeterOfRectangle(height, width);
        //closing scanner object
        scanner.close();
    }
}
