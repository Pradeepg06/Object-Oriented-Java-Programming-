import java.util.Scanner;
public class matrix_mul{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int row1,col1,row2,col2;

        System.out.println("Enter the number of rows for matrix1 ");
        row1=sc.nextInt();
        System.out.println("Enter the number of columns for matrix1 ");
        col1=sc.nextInt();

        System.out.println("Enter the number of rows for matrix2 ");
        row2=sc.nextInt();
        System.out.println("Enter the number of columns for matrix2 ");
        col2=sc.nextInt();

        if(col1 != row2)
        { System.out.println("matrix multiplication not posssible");}

        else{
            int a[][]= new int [row1][col1];
            int b[][]= new int [row2][col2];
            int c[][]= new int [row1][col2];

            System.out.println("enter the values for matrix A");
            for (int i=0; i<row1; i++)
            {
                for(int j=0; j<col1; j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            
            System.out.println("enter the values for matrix B");
            for (int i=0; i<row2; i++)
            {
                for(int j=0; j<col2; j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }

            System.out.println("Performing Matrix Multiplication:");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    c[i][j]=0;
                    for(int k=0; k<col1; k++){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                    System.out.println(c[i][j] + " ");
                }
            }
        }

    }
}