import java.util.Random;
import java.util.Scanner;

public class aaaa {
    public static void main(String[] args) {

        System.out.println("Please guess the number");

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int x = 0;
        aaaa a = new aaaa();
        int minRange = 1;
        int maxRange = 100;

        while (x==0){

            int computerGuess = (int) (minRange + Math.random() *maxRange);
            System.out.println("Computer number is: " + computerGuess);
            System.out.println("Print 1 if computer number is too big, and print 2 if too small");
            int userOutput = scan.nextInt();
            if(userOutput==0){
                x = 1;
            }else if(userOutput==1){
                maxRange =  computerGuess - 1;
            }else if(userOutput==2){
                minRange =  computerGuess + 1;
            }
        }
        System.out.println("Computer did it!");
    }
}
