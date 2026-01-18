package LinearSearch;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {5,6,7},
            {21,62,71},
        };
        // int[] found = search(arr,71);
        // System.out.println(Arrays.toString(found));
        max(arr);
    }

    static int[] search(int [][] arr, int target){

        for(int i = 0 ; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    System.out.println("Target Found at Row : "+i+ " & Col : "+ j + " Target : "+ target);
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(" Max Value : "+ max);
        return max;
    }
}
