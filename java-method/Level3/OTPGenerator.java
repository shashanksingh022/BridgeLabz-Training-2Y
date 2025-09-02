public class OTPGenerator {
    public static void main(String[] args) {
        int[] otp = new int[10];
        boolean unique = true;

        for (int i = 0; i < 10; i++) {
            otp[i] = 100000 + (int)(Math.random() * 900000);
            System.out.println("OTP " + (i+1) + ": " + otp[i]);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (otp[i] == otp[j]) unique = false;
            }
        }
        System.out.println("All unique? " + unique);
    }
}
