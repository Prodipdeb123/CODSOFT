import java.io.*;
import java.util.*;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chances = 10;
        int finals = 0;
        boolean playAgain = true;
        System.out.println("   Welcome to number guessing duniya");
        System.out.println("Hello dear here are total "+ chances+ " chances to win the game");
        while(playAgain){
            int rand= getrandN(1,100);
            boolean guess = false;
            for(int i=0; i<chances; i++){
                System.out.println("chance "+(i+1)+" enter your guess");
                int user= sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("Congratulation! you won the game.");
                    break;
                }
                else if(user>rand){
                    System.out.println("too high");
                }
                else{
                    System.out.println("too low");
                }

            }
            if(guess==false){
                System.out.println("Sorry you lost the chances, better luck next time\n the number is "+ rand);
            }
            System.out.println("Do you want to play again(yes/n0)");
            String pA= sc.next();
            playAgain= pA.equalsIgnoreCase("yes");
        }
        System.out.println("hope you anjoyed it");
        System.out.println("here is your score "+ finals);
    }
        public static int getrandN(int min, int max){
            return (int)(Math.random()*(max-min+1)+min);
        }
        


    }
