package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Printarrays {
    public static void main(String[] args) {
        // int [] arr = new int[5];

        System.out.print("Enter The Elements : ");
        Scanner sc = new Scanner(System.in);
 
        // Array of primitives 
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int no : arr){
        //     System.out.print(no);
        // }
        
        //array of objects
        String [] str = new String[4];

        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
        change(str);
        System.out.print(Arrays.toString(str));
        
        //  System.out.println(Arrays.toString(str));
        //  str[2] = "Kshatriye";
        //  System.out.println(Arrays.toString(str));
        sc.close();
    }
    static void change(String [] arr){
        arr[0] = "dakshhhhh";
    }
}
