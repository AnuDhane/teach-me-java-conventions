package powerpackage;

public class Powerfinder {
    public static int powerOf(int base, int exponent) {
        int ans = 1;
        for (int i = 0; i<exponent; i++) {
            ans*= base;
        }
        return ans;
    }
}
