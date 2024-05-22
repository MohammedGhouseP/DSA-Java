import java.util.*;

public class BinTODecimal {
   

    public static void BinToDec(int num) {
        int n = num;
       int pow = 0;
       int binNumber = 0;

       while(num > 0){
        int ld = num % 10;
        binNumber = binNumber +(ld * (int)Math.pow(2,pow));
        pow++;
        num =  num /10;
       }
        
        System.out.println(n +" is  "+ binNumber);
    }
    public static void main(String[] args) {
        BinToDec(10111);        
    }
}
