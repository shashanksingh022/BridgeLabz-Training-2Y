import java.util.Scanner;

public class largestofthree{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num={0,0,0};
        for(int i=0;i<num.length;i++){
            System.out.printf("Enter the number %d: ",i+1);
            num[i]=sc.nextInt();
        }

        System.out.println("Is the first number the largest?");
        if(num[0]>num[1] && num[0]>num[2]){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("Is the Second number the largest?");
        if(num[1]>num[0] && num[1]>num[2]){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("Is the thrid number the largest?");
        if(num[2]>num[1] && num[2]>num[0]){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
