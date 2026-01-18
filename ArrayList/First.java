package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // ArrayList <Integer> list = new ArrayList<>(5);
        // for(int i = 0; i < 5; i++){
        //     list.add(sc.nextInt());
        // }

        // for(int i : list){
        //     System.out.println(i);
        // }

        // for(int i = 0; i<5; i++){
        //     System.out.print(list.get(i));
        // }

        //MULTIDIMENSIONAL ARRAY LIST
        ArrayList<ArrayList<Integer>> hello = new ArrayList<>(4);

        for(int i = 0; i<5; i++){
            hello.add(new ArrayList<>());
            for(int j = 0; j<5; j++){
                hello.get(i).add(sc.nextInt());
            }
        }
        for(int j = 0; j < hello.size(); j++){
               System.out.print(hello.get(j));
            }
            sc.close();
    }
}
