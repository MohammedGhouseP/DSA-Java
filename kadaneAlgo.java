// import java.util.*;

public class kadaneAlgo {
    public static void sumOfMax(int num[]) {
        int cs = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0) {
                cs = 0;
            }
            max = Math.max(max,cs);
        }
        System.out.println(max);
        // return sum;

    }

    public static void main(String[] args) {
        int num[] = { 2, -20, -2, 40, -20 };
        sumOfMax(num);
    }
}
