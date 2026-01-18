package Functions;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        // String message = greet("Daksh Saini is the best");
        swap(30,5);
    }

    static void swap(int a, int b){
        // System.out.print("Enter Two Numbers : ");
        // Scanner sc = new Scanner(Syst
        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        
        System.out.print(a + " " + b);
    }

    static String greet(String name) {
        String ms = "hello " + name;
        System.out.println(ms);
        return ms;
    }
}
