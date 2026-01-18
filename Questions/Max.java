package Questions;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int [] arr = {7,9,3,1};
        // System.out.println(max(arr));
        // max(arr);
        // reverse(arr);
        Rev(arr);
        // System.out.print(Arrays.toString(arr));
    }  
    
    static void Rev(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = start;
            start = end;
            end = temp;
            start++;
            end--;
            System.out.println(Arrays.toString(arr));
        }
    }
    
    static void reverse(int [] arr){
        for(int i = arr.length - 1; i>=0; i--){
        }
        System.out.print(Arrays.toString(arr));
    }

    static int max(int [] arr){
        int largest = arr[0];
        for(int n : arr){
            if(largest < n){
                largest = n;
                System.out.println(largest);
            }
        }
        return largest;
    }
}
