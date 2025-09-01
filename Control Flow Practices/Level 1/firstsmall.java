import java.util.Scanner;

public class firstsmall{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2: ");
        int num2=sc.nextInt();
        System.out.println("Enter the number 3: ");
        int num3=sc.nextInt();
        System.out.println(" Is the first number the smallest? ");
        if((num1<num2) && (num1<num3)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
