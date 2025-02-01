// pattern1
class Patternbasic{
    public static void main(String[] args){
        int n =4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*

* * * * 
* * * *
* * * *
* * * *


*/

//pattern 2

class Patternbasic2{
    public static void main(String[] args){
        int n =4;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output

/*

* 
* *
* * *
* * * *

*/

class Patternbasic3{
    public static void main(String[] args){
        int n =4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//output

/*

* * * * 
* * * 
* * 
* 

*/

class Patternbasic4{
    public static void main(String[] args){
        int n =4;
        int s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("* ");  
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}

//output

/*

* * * * 
*     *
*     *
* * * *

*/

class Patternbasic5{
    public static void main(String[] args){
        int n =4;
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i-1;s++){
                System.out.print("  ");      
        }
        for(int j=0;j<2*i+1;j++){
                System.out.print("* ");      
        }
        System.out.println();   
        }
    }
}

//output

/*

      * 
    * * *
  * * * * *
* * * * * * *

*/

//optimised one 

class Patternbasic6{
    public static void main(String[] args){
        int n =4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n+i;j++){
                if(j<n-i-1){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }           
        }
        System.out.println();   
        }
    }
}

//output

/*

      * 
    * * *
  * * * * *
* * * * * * *

*/

class Patternbasic7{
    public static void main(String[] args){
        int n =4;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");      
        }
            for(int j=0;j<2*i+1;j++){
                System.out.print("* ");      
        }
        
        System.out.println();   
        }
    }
}

//output

/*

* * * * * * * 
  * * * * *
    * * *
      *

*/

class Patternbasic8{
    public static void main(String[] args){
        int n =4;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n+i;j++){
                if(j<n-i-1){
                    System.out.print("  ");
                } 
                else{
                    System.out.print("* ");
                }    
        } 
        System.out.println();   
        }
    }
}

//output

/*

* * * * * * * 
  * * * * *
    * * *
      *

*/


class Patternbasic9{
    public static void main(String[] args){
        int n =4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");      
        }
            for(int s=1;s<=i;s++){
                System.out.print("* ");      
        }
        
        System.out.println();   
        }
    }
}

//output

/*

   * 
  * *
 * * *
* * * *

*/

class Patternbasic10{
    public static void main(String[] args){
        int n =4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");      
        }
            for(int s=1;s<=i;s++){
                System.out.print(i+" ");      
        }
        
        System.out.println();   
        }
    }
}

/*

   1 
  2 2
 3 3 3
4 4 4 4

*/

class Patternbasic11{
    public static void main(String[] args){
        int n =4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*

1 
1 2
1 2 3
1 2 3 4

*/

class Patternbasic12{
    public static void main(String[] args){
        int n =4;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(num+" ");
                num++;   
            }
            System.out.println();
        }
    }
}

/*

1 
2 3
4 5 6
7 8 9 10

*/


class Patternbasic13{
    public static void main(String[] args){
        int n =5;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
                  
            }
            System.out.println();
        }
    }
}

/*

1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/


class Patternbasic14{
    public static void main(String[] args){
        int n =4;
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i-1;s++){
                System.out.print("  ");      
        }
        for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");      
        }
        for (int j = i; j >= 1; j--) {
                System.out.print(j+ " ");
            }
        System.out.println();   
        }
    }
}

/*

      1 
    1 2 1 
  1 2 3 2 1
1 2 3 4 3 2 1

*/

class Patternbasic15{
    public static void main(String[] args){
        int n =5;
        for(int i=1;i<=n;i++){
            for(int s=0;s<=n-i-1;s++){
                System.out.print("  ");      
        }
        for (int j = i; j >= 1; j--) {
                System.out.print(j+ " ");
            }
        for(int j=2;j<=i;j++){
                System.out.print(j+" ");      
        }
        System.out.println();   
        }
    }
}


/*

        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/