package Questions;
import java.util.Scanner;
public class CountOccu {
    public static void main(String[] args) {
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("enter the number you want to check :");
        int n = sc.nextInt();

        int count = 0;
        while (num>0){
            int rem = num % 10;
            if(rem == n){
            count++;
            }
            num = num/10;
        }
        System.out.println(count);
        sc.close();
    }
}
