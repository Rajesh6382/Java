import java.util.Scanner;
public class Leapyear{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = scn.nextInt();
        if((year%4==0 && year%100 !=0 ) || (year%400==0)){
            System.out.println(year +" is Leap Year");
        }
        else{
            System.out.println( year +"is Not a Leap Year");
        }
        
    }
}