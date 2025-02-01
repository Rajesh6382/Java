import java.util.Scanner;
public class Positiveorneg{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Ente4r a Number:");
        int a = scn.nextInt();
        if(a == 0)
        System.out.println("The Number is Zero");
        else if(a>=1)
        System.out.println("The Number is Positive");
        else 
        System.out.println("The Number is Negative");


    }
}