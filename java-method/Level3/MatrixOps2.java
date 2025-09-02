public class MatrixOps2 {
    public static void main(String[] args) {
        int[][] A={{1,2},{3,4}};
        int[][] T={{A[0][0],A[1][0]},{A[0][1],A[1][1]}};

        System.out.println("Transpose:");
        for(int[] row:T){for(int val:row)System.out.print(val+" ");System.out.println();}

        int det2 = A[0][0]*A[1][1]-A[0][1]*A[1][0];
        System.out.println("Determinant 2x2 = "+det2);

        if(det2!=0){
            double[][] inv={{A[1][1]/(double)det2,-A[0][1]/(double)det2},{-A[1][0]/(double)det2,A[0][0]/(double)det2}};
            System.out.println("Inverse:");
            for(double[] row:inv){for(double val:row)System.out.print(val+" ");System.out.println();}
        }
    }
}
