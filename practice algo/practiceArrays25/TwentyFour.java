
public class TwentyFour {

    public static int MakeTotalreturnHigh(int[] a, int[] b, int[] c) {

        if (a == null || b == null || c == null ||
            a.length == 0 || b.length == 0 || c.length == 0) {
            return 0;
        }

        int totalA = 0;
        int totalB = 0;
        int totalC = 0;

        for (int i = 0; i < a.length; i++) {

            totalA += a[i];
            totalB += b[i];
            totalC += c[i];
        }

        int max = totalA;

        if (totalB > max) {
            max = totalB;
        }

        if (totalC > max) {
            max = totalC;
        }

        return max;
    }

    public static void main(String[] args) {

        int[] a = {78, 65, 90, 65, 82};
        int[] b = {70, 80, 85, 60, 82};
        int[] c = {50, 30, 70, 100, 56};

        int result = MakeTotalreturnHigh(a, b, c);

        System.out.println("Highest total score: " + result);
    }
}
