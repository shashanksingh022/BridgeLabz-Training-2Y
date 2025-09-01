import java.util.Scanner;

public class naturalnumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num>0){
            System.out.printf("The sum of %d natural numbers is %d",num,num*(num+1)/2);
        }
        else{
            System.out.printf("The number %d is not a natural number",num);   
        }
    }
}
