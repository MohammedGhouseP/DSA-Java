import java.util.*;
public class lineaarSearch {
    public static int number(int arr[], int key){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,4,2,5,66};
        int key= 20;
        int index = number(arr,key);
        if(index == -1){
            System.out.println("element is not found");
        }else{
            System.out.println("element is found at "+ index);
        }
    }
}