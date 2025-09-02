import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // weight, height, bmi

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();

            double heightMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightMeters * heightMeters);

            String status;
            if (data[i][2] < 18.5) status = "Underweight";
            else if (data[i][2] < 24.9) status = "Normal";
            else if (data[i][2] < 29.9) status = "Overweight";
            else status = "Obese";

            System.out.println("Weight: " + data[i][0] + ", Height: " + data[i][1] + ", BMI: " + data[i][2] + " => " + status);
        }
        sc.close();
    }
}

