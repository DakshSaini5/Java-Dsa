package Questions;
import java.util.*;;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Operator : ");

        while (true) {
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '/' || op == '%' || op == '*') {
                System.out.print("Enter num 1 :");
                float num1 = sc.nextInt();
                System.out.print("Enter num 2 :");
                float num2 = sc.nextInt();
                if (op == '+') {
                    float result = num1 + num2;
                    System.out.println("Answer is : " + result);
                } else if (op == '-') {
                    float result = num1 - num2;
                    System.out.println("Answer is : " + result);
                } else if (op == '/') {
                    float result = num1 / num2;
                    System.out.println("Answer is : " + result);
                } else if (op == '%') {
                    float result = num1 % num2;
                    System.out.println("Answer is : " + result);
                } else if (op == '*') {
                    float result = num1 * num2;
                    System.out.println("Answer is : " + result);
                }
            } 
            else {
                System.out.print("Invalid Input");
            }
            sc.close();
        }
        
    }
}
