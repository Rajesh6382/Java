class Voting{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your Age:");
        int age = scn.nextInt();
        if(age>=18)
        System.out.println("Eligible for voting");
        else
        System.out.println(" Not Eligible for voting");


    }
} 

// Output

/*
Please enter your Age:7
 Not Eligible for voting

 Please enter your Age:66
Eligible for voting 
*/