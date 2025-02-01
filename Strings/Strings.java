import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=scn.nextLine();

        char[] chars=input.toCharArray();
        String reverse="";

        for(int i=chars.length-1;i>=0;i--){
            reverse+=chars[i];
        }
        System.out.println("Reversed String : "+reverse);

    }
}

//output

/*

Enter the String
Rajesh
Reversed String : hsejaR

*/


//Palidrome


class Palindrome {
    public static void main(String[] args) {
        String str = "Madam";
        String s = str.toLowerCase();
        String rev = "";

        
        int n = str.length();

       
        for (int i = n - 1; i >= 0; i--) { 
            rev = rev + s.charAt(i); 

        }
        System.out.println(rev);
        if (s.equals(rev)) { 
            System.out.println("The above string is a palindrome");
        } else {
            System.out.println("The above string is not a palindrome");
        }
    }
}


class palindrome1 {
    public static void main(String[] args) {
        String str = "Madam";
        str = str.toLowerCase(); 
        boolean isPalindrome = true;

        int n = str.length();

        
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) { 
                isPalindrome = false;
                break; 
            }
        }

        
        if (isPalindrome) {
            System.out.println("The above string is a palindrome");
        } else {
            System.out.println("The above string is not a palindrome");
        }
    }
}




// Count the number of vowels and consonants in a string.

class VowelConsonantsCount{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str=scn.nextLine();

        int vowel=0;
        int consonants=0;

        String LowerCase=str.toLowerCase();

        for(int i=0;i<LowerCase.length();i++){
            char c=str.charAt(i);
            if(c>='A'&&c<='Z'){
                c= (char) (c+32);
            }
            if(c>='a'&&c<='z'){

                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    vowel++;
                }
                else{
                    consonants++;

                }
            }
                
            

        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonants);

    }

}

// Output

/*

Enter a String:Rajesh
Number of vowels: 2
Number of consonants: 4


Enter a String:aeiou
Number of vowels: 5
Number of consonants: 0

*/

//frequency of a char

class FrequencyofChar{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = scn.nextLine();

        str=str.toLowerCase();

        int [] frequency=new int[256];

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            frequency[c]++;
        }
        System.out.print("Char Frequency");
        for(int i=0; i<256;i++){
            if (frequency[i] > 0) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
}

// Output

/*


Enter a String:hello
Char Frequencye: 1
h: 1
l: 2
o: 1


Enter a String:hi hello
Char Frequency : 1
e: 1
h: 2
i: 1
l: 2
o: 1

*/


// Remove Space form the string



class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int index=0;

        char[] chars=new char[str.length()];
        for(int i=0;i>str.length();i++){
            char c = str.charAt(i);
            if(c !=' '){
                chars[index]=c;
                index++;
            }
        }
        String noSpaces = new String(chars, 0, index);  
        System.out.println("String without spaces: " + noSpaces);
    }
}


//Output

/*

Enter a string: Hi Hello! How Are You!
String without spaces: HiHello!HowAreYou!


Enter a string: Hello World
String without spaces: HelloWorld

*/


// Intermidiate

// Anagram

class Anagram{
    public static void main(String[] args){
        String str1="cap";
        String str2="pcc";        
        int count=0;

        if(str1.length()==str2.length()){
            for(int i=0;i<str1.length();i++){
                char ch =str1.charAt(i);
                for(int j=0;j<str2.length();j++){
                    if(ch == str2.charAt(j)){
                        count++;
                        break;
                    }
                }
                
            }

            if(count == str2.length()){
                System.out.println("Anagram");
            }
            else{
                System.out.println("not an Anagram");
            }
            
        }

    }
}

/*

 str1="cap";
 str2="pcc"; 

 Not an Anagram


*/

//Count the number of words in a string.

class Countword{
    public static void main(String[] args){
        String str="Hi! Hello! How are you!";
        int count =1;
        for(int i=1;i<str.length();i++){
            if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.print("The given strings word count is"+count);
    }
}

/*
str="Hi! Hello! How are you!";

The given strings word count is5

*/

