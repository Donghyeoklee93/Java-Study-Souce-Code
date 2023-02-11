import java.util.*;
public class GuessingNumber {
    public static void main(String[] args){
        int answer = (int) (Math.random()*100)+1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.print("Enter one number between 1 and 100 :");

            try{
                input = new Scanner (System.in).nextInt();
            } catch(Exception e){
                System.out.println("It's not valid number. please enter again.");
                continue;
            }

            if(answer > input){
                System.out.println("Enter the larger number.");

            } else if(answer < input) {
                System.out.println("Enter the lower number.");
            } else {
                System.out.println("You are correct in " +count+" time(s)");
                break;
            }
        } while(true);
    }
}
