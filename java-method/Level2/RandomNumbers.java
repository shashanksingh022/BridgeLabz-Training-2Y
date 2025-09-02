public class RandomNumbers {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0, min = 9999, max = 1000;

        for (int i = 0; i < 5; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
            System.out.print(arr[i] + " ");
            sum += arr[i];
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("\nAverage = " + (sum / 5.0));
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}

