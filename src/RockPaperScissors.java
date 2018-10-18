
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args){
        String personPlay;
        int computerInt;
        String computerMove;


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Hey, let's play Rock, Paper, Scissors!\n" +
                "Please enter a move.\n" + "Rock = R, Paper" +
                "= P, and Scissors = S.");
        System.out.println();


        computerInt = generator.nextInt(3)+1;
        if (computerInt == 1)
            computerMove = "Rock";
        else if (computerInt == 2)
            computerMove = "Paper";
        else if (computerInt == 3)
            computerMove = "Scissors";
        System.out.println("Enter your play: ");
        personPlay = scan.next();

        personPlay = personPlay.toUpperCase();



        System.out.println("Computer play is:"+computerMove);

        if (personPlay.equals(computerMove))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerMove.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else if (computerMove.equals("P"))
                System.out.println("Paper eats rock. You lose!!");
            else if (personPlay.equals("P"))
                if (computerMove.equals("S"))
                    System.out.println("Scissor cuts paper. You lose!!");
                else if (computerMove.equals("R"))
                    System.out.println("Paper eats rock. You win!!");
                else if (personPlay.equals("S"))
                    if (computerMove.equals("P"))
                        System.out.println("Scissor cuts paper. You win!!");
                    else if (computerMove.equals("R"))
                        System.out.println("Rock breaks scissors. You lose!!");
                    else
                        System.out.println("Invalid user input.");



    }
}
