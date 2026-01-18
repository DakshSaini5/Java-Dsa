package LinearSearch;

import java.util.Arrays;

public class Range {
    public static void main(String[] args) {
        String name = "Saini";
        System.out.println(Arrays.toString(name.toCharArray()));
        Linear(name, 'i', 1, 3);
    }

    
    static int Linear(String name, char target, int start, int end){       // in this range onw we will add start and end                                                                     // varibale so that we can specify the start and end in for loop
        for(int i = start; i < end; i++ ){
            if(name.charAt(i) == target){
                System.out.println("N : "+ target + " at Index : "+i);
                return i;
            }
        }
        return -1;
    }
}
