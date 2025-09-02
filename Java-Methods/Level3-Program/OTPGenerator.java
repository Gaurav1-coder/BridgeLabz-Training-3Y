import java.util.*;

public class OTPGenerator {

  
    public static int generateOTP() {
        return (int)(100000 + Math.random() * 900000);
    }


    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        if (areOTPsUnique(otps)) {
            System.out.println(" All OTPs are unique.");
        } else {
            System.out.println(" Duplicate OTPs found.");
        }
    }
}
