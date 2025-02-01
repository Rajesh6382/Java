package Methods;

import java.util.Scanner;

class Function{

    int factorial(int num){
        int fact=1;
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
    return fact;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Function funt= new Function();
        System.out.print("Enter a number:");
        int num =scn.nextInt();

        int factorial=funt.factorial(num);
        System.out.println("Factorial ="+factorial);
        scn.close();

    }
}

class CheckPrime{

    static boolean isprime(int num){
        if(num<=0){
            return false;
        }
        if(num<=3){
            return true;
        }
        if(num%2==0||num%3==0){
            return false;
        }
        for (int i=5;i*i<num;i+=6){
            if(num%i==0||num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scn.nextInt();

        if(isprime(num)){
            System.out.println("The given number is prime");
        }
        else{
            System.out.println("The given number is not a7 prime");
        }

    }
}

class SumOfDigit{

    static int sumofdigit(int num){
        int sum=0;
        while(num>0){
            int digit = num%10;
            sum = sum+digit;
            num=num/10;
        }
    return sum;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        SumOfDigit sum= new SumOfDigit();
        System.out.print("Enter a number:");
        int num = scn.nextInt();

        int sumOfdigit=sum.sumofdigit(num);
        System.out.println("The sum is:"+sumOfdigit);

    }
}



class Armstrong {

    static boolean armstrong(int num) {
        int originalNum = num;
        int digits = 0;
        
       
        int temp = num;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            
            
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            
            sum =sum+ power;
            temp = temp / 10;
        }

        
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        if (armstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}


class Power{

    static int power(int base,int exp){
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
    return pow;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Base number: ");
        int base = scn.nextInt();
        System.out.print("Enter a Exponent number: ");
        int exp = scn.nextInt();

        int power=power(base, exp);
        System.out.println("Result = "+power);

    }
}

class Reverse{

    static int reverse(int num){
        int rev = 0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
    return rev;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        int rev = reverse(num);
        System.out.println("Reveserd number is :"+rev);
    }
}


class fibonacci{

    static void fibonacci(int num){
        int [] arr = new int[num];
        arr[0]=0;
        arr[1]=1;
        int i=0;
        for (i=2;i<num;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
         for(int n : arr){
            System.out.print(n+" ");

         }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        fibonacci(num);
        scn.close();

    }
}

class GCD{

    static int gcd(int a,int b){
        
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scn.nextInt();
        System.out.print("Enter a number: ");
        int b = scn.nextInt();

        gcd(a,b);
        int result=gcd(a,b);
        System.out.println("Result is: "+result);
    }
}



class perfect{

    static boolean perfect(int num){
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum==num;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        if(perfect(num)){
            System.out.println("The given number is perfect");
        }else{
            System.out.println("The above number is not perfect");
        }
    }
}

class factor{
    static int factor(int num){
        int count=1;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
       return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        int fact=factor(num);
        System.out.println("Number of factor is:"+fact);
    }

}


class Palidrome{
    static boolean ispalidrome(String str){
        for(int i=0,j=str.length()-1;i<=j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                 return  false;
            }
            break;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str =scn.nextLine();
        str=str.toLowerCase();

        if(ispalidrome(str)){
            System.out.println("The given string is a palidrome");
        }
        else{
            System.out.println("The given string is not a palidrome");
        }

    }
}



class Palindromes {

    
    static boolean isPalindrome(char[] charArray) {
        for (int i = 0, j = charArray.length - 1; i <= j; i++, j--) {
            if (charArray[i] != charArray[j]) { 
                return false;  
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.nextLine();

        
        char[] charArray = str.toCharArray();

        
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch >= 'A' && ch <= 'Z') {
                charArray[i] = (char) (ch + 32);  
            }
        }

        
        if (isPalindrome(charArray)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}




 