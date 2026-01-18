package Questions;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.print("enter a charactrer : ");
        Scanner sc = new Scanner(System.in);
        
        char ch  = sc.next().charAt(0);
        // int num = (int) ch;

        if(ch >= 90 && ch <= 122){
            System.out.print("Smaller Case");
            System.out.println((int)(ch));
        }
        else {
            System.out.print("Uppercase");
            System.out.println((int)(ch));
        }
        sc.close();

    }
    
}
