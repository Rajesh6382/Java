
class calculator{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("..........Simple Calculator..........");
        System.out.println("*************************************");
        System.out.println("1.Addition");
        System.out.println("2.Subraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Please Enter the choice below (1-4):");
        int choice=scn.nextInt();

        System.out.print("Enter the first number:");
        int a=scn.nextInt();
        System.out.print("Enter the second number:");
        int b=scn.nextInt();

        switch(choice){
        case 1:
            System.out.print("Result" + (a+b));
            break;
        case 2:
            System.out.print("Result" + (a-b));
            break;
        case 3:
            System.out.print("Result" + (a*b));
            break;
        case 4:
            if(b != 0)
            System.out.print("Result" + (a/b));
            else
            System.out.print("Errow:Divisible by zero is not allowed");
            break;
        default:
            System.out.println("Invalid choice. Please select a valid operation (1-4).");
    }

        
    }
}

// Output

/*
..........Simple Calculator..........
*************************************
1.Addition
2.Subraction
3.Multiplication
4.Division
Please Enter the choice below (1-4):3
Enter the first number:7
Enter the second number:7
Result49

..........Simple Calculator..........
*************************************
1.Addition
2.Subraction
3.Multiplication
4.Division
Please Enter the choice below (1-4):3
Enter the first number:7
Enter the second number:7
Result49


..........Simple Calculator..........
*************************************
1.Addition
2.Subraction
3.Multiplication
4.Division
Please Enter the choice below (1-4):2
Enter the first number:60
Enter the second number:30
Result30

*/