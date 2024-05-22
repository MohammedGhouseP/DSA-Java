import java.util.*;

public class tryPrime {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // if(n %2 ==0){
        // System.out.println("Its not prime");
        // // return 0;

        // }
        // else{
        // // for(int i = 1; i<= Math.sqrt(n); i++){
        // System.out.println("its primr");
        // // }
        // // System.out.println("Its a prime "+n);

        // }
        System.out.println(factorial(4));
        System.out.println(binomial(5,2));

        
    }
    public static int factorial(int n){
        int f= 1;
        for(int i=1; i<=n ; i++){
            f = f*i;
        }
        return f;
        }
    public static int binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int nmr = factorial(n-r);
        int bi = fact_n / (fact_r*nmr);
        return bi;

    }
}
