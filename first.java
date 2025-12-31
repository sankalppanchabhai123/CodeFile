
import java.util.*;

public class first {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= sc.nextInt();

        if(isPalindrom(number)){
            System.out.println("the number is pallindrom");
        }
        else{
            System.out.println("the nusmber is not a pallindrom");
        }
    }
    public static Boolean isPalindrom(int number){
        int revers=0;
        int pallindrom=number;
        int remainder=0;
        while(number!=0){
            remainder=pallindrom%10;
            revers=revers*10 +remainder;
            pallindrom=pallindrom/10;
        }
        if(revers==number){
            return true;
        }
        else{
            return false;
        }
    }
}
