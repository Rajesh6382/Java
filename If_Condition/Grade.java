import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Mark:");
        int marks = scn.nextInt();
        if(marks>=90)
        System.out.print("Grade A");
        else if(marks>=80)
        System.out.print("Grade B");
        else if(marks>=70)
        System.out.print("Grade C");
        else if(marks>=60)
        System.out.print("Grade D");
        else if(marks>=50)
        System.out.print("Grade E");
        else
        System.out.print("Grade U");


    }
}
// Output 

/*
Enter a Mark:55
Grade E
Enter a Mark:25
Grade U
Enter a Mark:99
Grade A 
*/