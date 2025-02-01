// Check Number is odd or even
import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
/******************************************************************************
Enter a number: 57
57 is odd
Enter a number: 32
32 is even
********************************************************************************** */





 