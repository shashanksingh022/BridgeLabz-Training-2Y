import java.util.Scanner;

public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        double[][] scores=new double[n][6]; // phy, chem, math, total, avg, %
        for(int i=0;i<n;i++){
            scores[i][0]=10+(int)(Math.random()*90);
            scores[i][1]=10+(int)(Math.random()*90);
            scores[i][2]=10+(int)(Math.random()*90);
            scores[i][3]=scores[i][0]+scores[i][1]+scores[i][2];
            scores[i][4]=scores[i][3]/3.0;
            scores[i][5]=(scores[i][3]/300.0)*100;
        }

        System.out.println("Phy Chem Math Total Avg %");
        for(int i=0;i<n;i++){
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+scores[i][3]+"\t"+Math.round(scores[i][4]*100.0)/100.0+"\t"+Math.round(scores[i][5]*100.0)/100.0);
        }
        sc.close();
    }
}
