import java.util.*;

public class pairs {
    public static int pairs(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int curr = num[i];
            for (int j = i; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
            }
            System.out.println();
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int num[] = { 2, 3, 5, 6, 7};
        pairs(num);
    }
}
