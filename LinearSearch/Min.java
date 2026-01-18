package LinearSearch;

import java.util.Arrays;
public class Min {
    public static void main(String[] args) {
        int [] arr = {5,3,9,11,43};
        int Minumum = min(arr);
        int Maximum = max(arr);
        System.out.println(" " + Minumum);
        System.out.print(" " + Maximum);
    }

    static int min(int [] arr){
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int [] arr){
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

