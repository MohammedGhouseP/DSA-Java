public class reverse_string {
    public static void main(String[] args) {
        int n = 327;
        int rev = 0;
        while(n > 0){
            int lastDigit = n%10;
            rev = (rev * 10) + lastDigit;
            // System.out.print(lastDigit + " ");
            n = n/10;
            // System.out.print(n +" ");
        }
        System.out.println(rev+ " ");

    }
}
