import java.util.Scanner;
public class Largestnumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = scn.nextInt();
        System.out.print("Enter the Second Number:");
        int b = scn.nextInt();
        if (a>b)
        System.out.println("First Number  is greater than Second Number");
        else
         System.out.println("Second Number is greater than First Number");

    }
}

// Output
/* 
Enter the First Number:8
Enter the Second Number:99
Second Number is greater than First Number

Enter the First Number:55
Enter the Second Number:7
First Number  is greater than Second Number

*/