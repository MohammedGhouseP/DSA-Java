public class largestNumber {
    public static int getNum(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }

            if(smallest > num[i]){
                smallest = num[i];
            }
            
        }
        System.out.println("smallest number is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {10,4,7,54,8,40};
        System.out.println(getNum(num));

    }
}
