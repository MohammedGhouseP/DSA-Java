public class sumOfSubArray {
    public static int sumArr(int num[]) {
        int sum = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                curr = 0;
                for (int k = i; k <= j; k++) {
                    curr = curr + num[k];
                }
                if(sum < curr){
                    sum = curr;
                    
                }
                

            }
            
            // System.out.println("the current ele is :" + curr);

        }
        System.out.println("number is greater : "+ sum);
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 31, -20, 23, 4 };
        sumArr(num);
    }
}
