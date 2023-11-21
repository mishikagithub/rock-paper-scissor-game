//Rock paper scicsor game//



import java.util.*;
import java.util.Scanner;
import java.util.Random;

//rock paper scissor
public class mytask1 {
    public static void main(String[] args){
   Scanner Sc = new Scanner(System.in);
        System.out.println("Enter \n 0 for scissor, 1 for paper, 2 for rock");
        int userInput= Sc.nextInt();
        Random random = new Random();
        int computer = random.nextInt(3);

        if(userInput == computer){
            System.out.println("Draw");
        }else if(userInput==0 && computer==1 || userInput==1 && computer==2 || userInput==2 && computer==0 ){
            System.out.println("you win");
        }else{
            System.out.println("you loss");
        }
        System.out.println("computer choice" +computer);
    }
}
