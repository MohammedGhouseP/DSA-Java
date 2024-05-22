public class factFunc
{

    public static int fact (int n){
        int f = 1;
        for(int i=1;i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int binomial(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr = fact(n-r);
        
        int bi = n_fact/(r_fact*nmr);
        return bi;
    }
    public static void main(String[] args) {
        System.out.println(fact(4)); //normal factorial
        System.out.println(binomial(5,5)); //binomial
    }
}