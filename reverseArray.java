public class reverseArray {
    public static int rev(int num[]) {
        int start = 0, end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 5, 4, 7 };
        System.out.println(rev(num));
        // for(int i =0; i<num.length; i++){
        //     System.out.print(num[i]+" ");
        // }
        // System.out.println();
    }
}
