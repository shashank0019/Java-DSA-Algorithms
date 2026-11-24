//present in first array not present in second array
import java.util.*;

public class TwentyTwo {

    public static int[] PresentInFirstNotSecond(int[] a, int[] b) {

        if (a == null || a.length == 0) {
            return null;
        }

        int[] temp = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {

            int count = 0;

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                temp[index] = a[i];
                index++;
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        int[] a = {78, 65, 90, 65, 82};
        int[] b = {70, 80, 85, 65, 82};

        int[] result = PresentInFirstNotSecond(a, b);

        System.out.println(Arrays.toString(result));
    }
}
