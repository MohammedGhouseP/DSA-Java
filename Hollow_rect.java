public class Hollow_rect {
    public static void HW(int rowLen,int colLen){
        for(int i =1; i <= rowLen; i++){
            for(int j= 1; j <=colLen ;j++){
                if(i == 1||i == rowLen|| j == 1 || j == colLen){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        HW(7,9);
    }




}
