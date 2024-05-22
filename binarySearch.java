public class binarySearch {
    public static int bin(int num[], int key) {

       int start = 0, end = num.length-1;
       while(start <= end){
        int mid = (start + end) /2;
        if(num[mid] == key){
            return mid;
        }
        if(num[mid] < key){
            start = mid +1;
        }else{
            end = mid -1;
        }
       }
       return -1;

    }

    public static void main(String[] args) {
        int num[] = { 2, 5, 6, 8, 24, 34, 55, 68 , 89};
        int key =68 ;
        System.out.println(bin(num, key));
    }
}
