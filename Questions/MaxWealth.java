package Questions;

import java.util.Arrays;
public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = {
            {1,5},
            {7,5},
            {2,1}
        };
        check(arr);

    }

    static void check(int [][] arr){
        int max = 0;
        // int min = arr[0][0]/;
        for(int i = 0; i < arr.length; i++){
            int Rowsum = 0;
            for (int j = 0; j < arr[i].length; j++){
                Rowsum = Rowsum + arr[i][j];

                if(Rowsum >= max){
                    max = Rowsum;
                }
            }
          
        }
        System.out.println(max);
        
          if(arr[0][0]== max){
                System.out.println("Richest is Row 0 : "+max);
            }
            else if (arr[1][0] == max){
                System.out.println("Richest is Row 1 : "+max);
            }
            else{
                System.out.println("Richest is Row 2 : "+max);
            }
    }
}
