package Functions;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        //int ans = num();
        String Mes = greet();
    }
    
    static int num() {
        System.out.print("Enter the Number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Kya re bhai ?");
        return n;
    }

    static String greet() {
        System.out.print("Enter the Greet Message : ");
        Scanner in = new Scanner(System.in);
        String gg = in.nextLine();
        System.out.println(gg);
        in.close();
        return gg;
    }
}

