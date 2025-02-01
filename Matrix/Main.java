import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int [][]arr= new int [2][2];
    arr[0][0]=1;
    arr[0][1]=2;
    arr[1][0]=3;
    arr[1][1]=4;

    for(int i=0;i<=1;i++){
        for(int j=0;j<=1;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println(" " );
    
    }

    }
}

class Sample{
    public static void main(String[] args) {
        int n =2;
        int m=2;
        int [][] arr = new int[n][m];
        int it = 4;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=it;
                it++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println( );
        }
    }
}

class Sample2{
    public static void main(String[] args) {
        int [][] arr={{3,4},{7,8},{6,9}};

        System.out.println(arr[1][0]);
    }
}

class Sample3{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the row value:");
        int row = scn.nextInt();
        System.out.print("Enter the row value:");
        int col = scn.nextInt();

        int [][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=(i+1)*(j+1);
            }      
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"  ");
            }  
            System.out.println( );    
        }
        scn.close();
    }
}

//Insertion in 2D Array 

class Insert{
    public static void main(String[] args) {
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        arr[1][1]=10;

        for(int row[]:arr){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        

    }

}



class ChangeRow{
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int []newRow={10,11,12};
        int index = 2;

        int [][] newArr= new int[arr.length+1][arr[0].length];

        for(int i=0 , j=0; i<newArr.length;i++){
            if(i==index){
                newArr[i]=newRow;
            }
            else{
                newArr[i]=arr[j];
                j++;
            }
        }

        for (int[] row : newArr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();

    }
}
}


class ChangeCol {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] newcol = {10, 11, 12};
        int index = 3;

       
        int[][] newArr = new int[arr.length][arr[0].length + 1];

        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 0; j < newArr[i].length; j++) {
                if (j == index) {
                    newArr[i][j] = newcol[i]; 
                } else {
                    newArr[i][j] = arr[i][k++]; 
                }
            }
        }

       
        for (int[] row : newArr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}


class Addition{
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b={{1,2,3},{4,5,6},{7,8,9}};
        int [][] c= new int [3][3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int row[]:c){
            for(int val:row){
                System.out.print(val+"    ");
            }
            System.out.println();
        }
    }
}

class Diagonal{
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = {{1,2,3},{4,5,6},{7,8,9}}; 
        int [][] result=new int [3][3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j){
                    result[i][j]=a[i][j]+b[i][j];
                }
                else{
                    result[i][j]=a[i][j];
                }
            }
        }
        for(int []row:result){
            for(int val :row){
                System.out.print(val+"  ");
            }
            System.out.println();

        }
    }
}

class mul{
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = {{1,2,3},{4,5,6},{7,8,9}}; 
        int [][] result=new int [3][3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                result[i][j]=a[i][j]*b[j][i];
            }
        }
        for(int []row:result){
            for(int val:row){
                System.out.print(val+"  ");
            }
            System.out.println( );
        }
    }
}

class LarorSmall{
    public static void main(String[] args) {
        int[][] arr ={{5,3,4},{6,9,12},{9,6,8}};

        int largest = 0;
        int smallest = 9;

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
        }
        System.out.println("The largest value in the matrix is:"+largest);
        System.out.println("The smallest value in the matrix is:"+smallest);
    }
}

class Transpose{
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans = new int[3][3];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                trans[i][j]=arr[j][i];
            }
        }
        for (int [] row:trans){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println( );
        }

        }
        
    }

    class SumofRowCol{
        public static void main(String[] args) {
            int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

            int Rowsum=0;
            int Colsum=0;

            for(int i =0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    Rowsum = Rowsum+arr[i][j];
                    Colsum=Colsum+arr[j][i];
                }
                System.out.println("Row Sum is   :"+Rowsum);
                System.out.println("Column Sum is:"+Colsum);
                Rowsum=0;
                Colsum=0;
            }
        }
    }



