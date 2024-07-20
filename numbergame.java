import java.util.*;
public class numbergame{
    public static void main(String[] args) {
        int notoguess,nooftries=0,guess,score=0;
        Boolean win = false;
        Boolean choice=true;
        //Create a random object
        Random random = new Random();
        //Create a scanner object for user input
        Scanner sc = new Scanner(System.in);
        //Generation of random number between 1 and 100
        notoguess= random.nextInt(100)+1;
        System.out.println("!!!!!!!!!  Welcome to number guessing game  !!!!!!!!!");
        System.out.println("!!!! I have selected a number between 1 and 100 !!!!");
        System.out.println("!!! Try to guess it there is five chance to guess !!! ");
        // Game loop
        while(choice){
        while(nooftries!=5 && !win){
            System.out.print("Enter your guess:- ");
            guess=sc.nextInt();
            nooftries++;

            if(guess<1 || guess>100){
                System.out.println("Please Enter the number between 1 and 100!");
            }
            else if(guess>notoguess){
            System.out.println("Your guess is greater than the number!");
            }
            else if(guess<notoguess){
                System.out.println("Your guess is lesser than the number!");
            }
            else{
                win=true;
                score=100;
                System.out.println("Congratulation! You have win the game!");
                System.out.println("Number of tries = "+nooftries+" Your score is = "+score);
            }

        }
        if(win!=true){
            System.out.println("You lose the game!");
            System.out.println("The number to be guess is:- "+notoguess);
            System.out.println("You Score is:- 0");
        }
        System.out.println("Enter true to play again! ");
        choice = sc.nextBoolean();
        nooftries=0;
        win=false;
        notoguess= random.nextInt(100)+1;

    }
    //close the scanner
    sc.close();
    }
}