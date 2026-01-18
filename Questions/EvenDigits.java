package Questions;

public class EvenDigits {
    public static void main(String[] args) {
        int [] num = {12,3,4,8941};
        Digtis(num);
    }

    static void Digtis(int [] num){
        for(int i : num){
            int Dig = String.valueOf(i).length();
            if(Dig % 2 == 0){
                System.out.println("The digits is even : "+i);
            }
            else{ 
                System.out.println("Odd");
            }
        }
    }
    
}
