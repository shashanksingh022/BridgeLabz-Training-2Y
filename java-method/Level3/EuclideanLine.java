import java.util.Scanner;

public class EuclideanLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        double x1=sc.nextDouble(), y1=sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2=sc.nextDouble(), y2=sc.nextDouble();

        double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double m = (y2-y1)/(x2-x1);
        double b = y1 - m*x1;

        System.out.println("Distance = "+dist);
        System.out.println("Equation: y = "+m+"x + "+b);
        sc.close();
    }
}
