class Main{
    static int average(int[] arr ){
        int div = arr.length;
        int sum =0;
        int avg;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        avg=sum/div;
    return avg;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        int avg = average(arr);
        System.out.println("Average = "+avg);

    }
}

class Addition{

    public static void main(String[] args) {
        int [][]a={{1,2},{3,4}};
        int [][]b={{5,6},{7,8}};
        int [][]c= new int[2][2];

        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int []row:c){
            for(int val:row){
                System.out.print(val+"  ");
            }
            System.out.println();
        }

    }
}

class Mul{

    public static void main(String[] args) {
        int [][]A={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int [][]B={{1,1,1,1}};

        int r1 = A.length;       
        int c1 = A[0].length;    
        int r2 = B.length;       
        int c2 = B[0].length;
        int [][]result= new int[4][4];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for(int []row:result){
            for(int val:row){
                System.out.print(val+"  ");
            }
            System.out.println();
        }

    }
}

class Transpos{
    public static void main(String[] args) {
        int [][]arr={{1,2},{3,4}};
        int [][]trans= new int[2][2];

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                trans[i][j]=arr[j][i];
            }
        }
        for(int []row:trans){
            for(int val:row){
                System.out.print(val+"  ");
            }
            System.out.println();
        }
    }
}


class Max{
    public static void main(String[] args) {
        int [] arr = {10,20,5,15};
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum = "+max);
    }
}

class Search{
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int key = 4;
        int position=3,;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                position=i;
            }
        }
        System.out.println("Position = "+position);
    }
}

class Reverse{
    public static void main(String[] args) {
        int [][]arr={{4,3},{2,1}};
        int [][]rev = new int[2][2];

        for (int i=1,k=0;i>=0;i--,k++){
            for(int j=1,l=0;j>=0;j--,l++){
                rev[k][l]=arr[i][j];   
            }
        }
        for(int []row:rev){
            for(int val:row){
                System.out.print(val+"  ");
            }
            System.out.println();
        }
    }
}

class Rotate{
    public static void main(String[] args) {
        int [][]arr={{3,1},{4,2}};
        int [][]trans=new int[2][2];
        int [][]rot = new int[2][2];


        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                trans[i][j]=arr[j][i];
            }
        }
        for (int i=0,k=0;i<arr.length;i++,k++){
            for(int j=1,l=0;j>=0;j--,l++){
                rot[k][l]=trans[i][j];   
            }
        }

            for(int []row:rot){
                for(int val:row){
                    System.out.print(val+"  ");
                }
                System.out.println();
            }
        }
    }



    class Merge {
        public static void main(String[] args) {
            int[] a = {1, 2, 3};
            int[] b = {4, 5, 6};
            int[] c = new int[a.length + b.length];
            
            int k = 0;
            
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
            }
            
            
            for (int i = a.length; i < c.length; i++) {
                c[i] = b[k++];
            }
    
            
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i] + " ");
            }
        }
    }
    


class SumofDia{
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{8,9,4},{7,6,5}};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i]==arr[j]){
                    sum=sum+arr[i][j];

                }
            }
        }
        System.out.println("Sum of Diagonal = "+sum);
    }
}

class CountOddorEven{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int counteven=0;
        int countodd=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                counteven++;
            }else{
                countodd++;
            }
        }
        System.out.println("Even ="+counteven);
        System.out.println("Odd ="+countodd);
    }
}

class SumofRow{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{8,9,4},{7,6,5}};
        int sum =0;
        int n=arr.length;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum=sum+arr[i][j]
            }
            System.out.print(sum+" ");
            sum =0;
       }

    }
}


class SpiralMatrix{
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1,2,3},{8,9,4},{7,6,5}
        
        };

        
        int n = matrix.length;
        
        
        int[] spiralArray = new int[n * n];
        int index = 0;

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

       
        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
                spiralArray[index++] = matrix[top][i];
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                spiralArray[index++] = matrix[i][right];
            }
            right--;

           
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralArray[index++] = matrix[bottom][i];
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralArray[index++] = matrix[i][left];
                }
                left++;
            }
        }

        
        System.out.print("List: ");
        for (int num : spiralArray) {
            System.out.print(num + " ");
        }
    }
}








    