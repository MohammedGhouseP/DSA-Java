public class subArray {
    public static int subArr(int num[]) {
        int add = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k]);
                    add  = add + num[k];   
                   
                }
                System.out.print(" the summ is :- "+add);
                add = 0;
                System.out.println();
            }
            System.out.println();
        }
        // System.out.print("total : " + add);

        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6, 7 };
        subArr(num);
    }
}
