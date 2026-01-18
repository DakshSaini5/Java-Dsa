import java.util.Arrays;
import java.util.Scanner;

public class Fr {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Salary : ");
        // int Salary = sc.nextInt();

        // if (Salary > 10000){
        // Salary = Salary + 2000;
        // }

        // else {
        // Salary = Salary + 1000;
        // }
        // System.out.println("Your Salary is : "+Salary);//

        // now we will look into TYPECASTING

        // int[] a = {1,2,35,5};
        // int[] b = a;
        // b[2] = 98;
        // System.out.println(Arrays.toString(b));

        // print numbers 1 to 5

        System.out.print("Enter three number : ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 != num2 && num1 != num3 && num2 != num3) {
            if (num1 > num2 && num1 > num3) {
                System.out.println(num1);
            } else if (num2 > num3 && num2 > num1) {
                System.out.println(num2);

            } else {
                System.out.println(num3);
            }
        }
        else {
            System.out.println("there is a duplicate value");
        }
    }
}
