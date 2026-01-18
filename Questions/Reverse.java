package Questions;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        System.out.print("Enter The numbers :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int ans = 0;

        while(num>0){
            int rem = num % 10;
            
            num = num / 10;
            ans = ans * 10 + rem;
        }
        System.out.print("Here is the reverse String : "+ans);
        sc.close();


        // System.out.print("Enter A String :");  THIS IS WITH OUR STRING AND CHARACTER
        // Scanner sc = new Scanner(System.in);

        // String n = sc.nextLine();

        // for(int i = n.length() - 1; i>=0; i--){
        //     System.out.print(n.charAt(i));
        // }
    }
    
}
