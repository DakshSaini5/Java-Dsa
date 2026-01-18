package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TDarrays {
    public static void main(String[] args) {
        
        System.out.print("Enter the elements for 2 D array  :");
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][2];

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
       for(int [] num : arr){
        System.out.println(Arrays.toString(num));
       }
       in.close();
    }
}
