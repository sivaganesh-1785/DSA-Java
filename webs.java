import java.util.*;
public class webs{
    public static void main(String[] args){
        int arr[] = {1, 7, 3, 6, 5, 6};
        System.out.println(Calc(arr));
    }
    static int Calc(int arr[]){
        int sum = 0;
        int lsum = 0;
        for(int i =0; i < arr.length; i++){
            sum += arr[i];
        }
        for(int j= arr.length - 1; j > 0; j--){
            lsum += arr[j];
            sum -= arr[j];

            if(lsum == sum){
                return arr[j];
            }
            else{
                return -1;
            }
        }
        return 0; 
    }
}
