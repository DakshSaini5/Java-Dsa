package LinearSearch;

import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name = "Daksh";
        System.out.println(Arrays.toString(name.toCharArray()));
        char found = find(name, 'h');
    }

    static char find(String name, char target){

        int i = 0;
        while(i < name.length()){
            if(name.charAt(i) == target){
                System.out.println("Index : " + i + " Name : " + name);
                return target;
            }
            i++;
        }
        return 0;
    }
}
