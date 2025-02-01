class Triangle {

    // Method to determine the type of triangle based on sides
    public static void determineTriangleType(int side1, int side2, int side3) {
        // Check if all sides are equal (Equilateral)
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        }
        // Check if two sides are equal (Isosceles)
        else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is Isosceles.");
        }
        // If no sides are equal (Scalene)
        else {
            System.out.println("The triangle is Scalene.");
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the lengths of the three sides
        System.out.print("Enter the first side of the triangle: ");
        int side1 = scanner.nextInt();
        
        System.out.print("Enter the second side of the triangle: ");
        int side2 = scanner.nextInt();
        
        System.out.print("Enter the third side of the triangle: ");
        int side3 = scanner.nextInt();

        // Call the method to determine the triangle type
        determineTriangleType(side1, side2, side3);
    }
}

//Output

/*

Enter the first side of the triangle: 3
Enter the second side of the triangle: 3
Enter the third side of the triangle: 3
The triangle is Equilateral.

Enter the first side of the triangle: 4
Enter the second side of the triangle: 5
Enter the third side of the triangle: 3
The triangle is Scalene.

Enter the first side of the triangle: 4
Enter the second side of the triangle: 4
Enter the third side of the triangle: 7
The triangle is Isosceles.

*/ 


class QuadraticEquvation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the nature of the roots
        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            // One real root (double root)
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and distinct:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}


//Output

/*
Enter coefficient a: 4
Enter coefficient b: 7
Enter coefficient c: 4
The roots are complex and distinct:
Root 1 = -0.875 + 0.4841229182759271i
Root 2 = -0.875 - 0.4841229182759271i

Enter coefficient a: 1
Enter coefficient b: -2
Enter coefficient c: 1
The roots are real and equal:
Root = 1.0 
*/