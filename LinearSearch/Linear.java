package LinearSearch;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,7,8};

        // System.out.print("Enter the Element You want : ");
        // boolean found = false;
        int index = Linear(arr, 8);

    }
    
    static int Linear(int [] arr, int target){      
        int n = 0;
         while(n < arr.length){
            if(arr[n] == target){
                System.out.println("N : "+ target + " at Index : "+n);
                return n;
            }
            n++;
        }
        return -1;
    }
}
