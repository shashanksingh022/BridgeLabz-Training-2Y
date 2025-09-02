import java.util.Scanner;

public class MatrixOps1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int r=sc.nextInt(), c=sc.nextInt();

        int[][] A=new int[r][c], B=new int[r][c], sum=new int[r][c], diff=new int[r][c], prod=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=(int)(Math.random()*10);
                B[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=A[i][j]+B[i][j];
                diff[i][j]=A[i][j]-B[i][j];
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                prod[i][j]=0;
                for(int k=0;k<c;k++) prod[i][j]+=A[i][k]*B[k][j];
            }
        }

        System.out.println("Addition:");
        for(int[] row:sum){for(int val:row)System.out.print(val+" ");System.out.println();}
        System.out.println("Subtraction:");
        for(int[] row:diff){for(int val:row)System.out.print(val+" ");System.out.println();}
        System.out.println("Multiplication:");
        for(int[] row:prod){for(int val:row)System.out.print(val+" ");System.out.println();}
        sc.close();
    }
}
