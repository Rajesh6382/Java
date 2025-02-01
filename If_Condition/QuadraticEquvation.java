

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