package Questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Arm();
    }

    static void Arm() {
        System.out.print("enter the number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;

        while (num > 0) {

            int n = num % 10;
            int cube = n * n * n;

            num = num / 10;

            result = result + cube;
        }
        System.out.println(result);
        sc.close();
    }
}
