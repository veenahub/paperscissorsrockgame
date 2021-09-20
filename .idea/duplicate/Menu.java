package com.example.duplicate;
import java.util.Scanner;

/** First it will show a menu like this 1.Newmatch 2.History 3.Endgame
 *  If you select 1.Newmatch again you will get 3 options 1.Bag 2.Scissors 3:Rock so you have to select any one of that
 *  and System will select one option based on logic you will win,loose or draw and result will store in a array
 *  once you played the game again you will get 3 options 1.Menu 2.Playagain 3.Endgame
 *  If you select 1.Menu again you will get 1.Newmatch 2.History 3.Endgame
 *  If you select 2.playagain you will get 1.Bag 2.Scissors 3:Rock
 *  If you select 2.History from menu .It will display your game result Then come
 *  the latest matches results are displayed at the bottom of the console.
 *  If you select 3.Endgame you will exit from the programme.
 *  @author veena.
 */
public class Menu {
      Player player = new Player();                // creating object for player class
      MathLogic gameLogic = new MathLogic();       // creating object for mathlogic class
      Computer system = new Computer();            // creating object for computer class
      Scanner  userInput = new Scanner(System.in); // creating object for Scanner class to take input from the user.

    //This is the method to print the main menu.
    public void printMainMenu() {
        System.out.println("Welcome to the Paper,Scissors,Rock Game\n" +
                "What do you choose?\n" +
                "1.New Match  2.History  3.End the Game");
        int userOption = userInput.nextInt();  // take input from the user and will store in a userOption variable.
        //Based on user input it will call appropriate method.
        switch(userOption) {
            case 1 :
                printPlayerChoiceMenu();      //prints player(rock,paper,scissors) options.
                break;
            case 2 :
                player.printMatchHistory();   //will print game history.
                printMainMenu();              //again it will print main menu.
                break;
            case 3 :
                System.out.println("Oh I am so sad come again and make me happy ");
                System.exit(0); //It will close the running program.
                break;
            default:
                System.out.println("Please choose between 1 and 3");
        }
    }
    public void printPlayerChoiceMenu()  {
        System.out.println("What do you choose Stone,Scissors or Rock?\n" +
                "  1.Paper  2.Scissors  3.Rock");
        player.askPlayerChoice();   //will take player choice.
        system.askComputerChoice(); //will take computer choice.
        //Here game logic will execute and result will add to history.
        player.addMatchToHistory(gameLogic.decideMatchResult(player,system));
        printAfterMatchMenu();     //prints menu,play again,close options.
    }
    //this method to print menu after play the game.
    public void printAfterMatchMenu() {
        System.out.println("What do you choose?\n" +
                "1.Menu  2.Repeat Again  3.End the Game");
        int userOption = userInput.nextInt();
        switch(userOption) {
            case 1 :
                printMainMenu();
                break;
            case 2 :
                printPlayerChoiceMenu();
                break;
            case 3 :
                System.out.println("Oh I am so sad come again and make me happy ");
                System.exit(0); //It will close the running program.
                break;
            default:
                System.out.println("Please choose between 1 and 3");
        }
    }
}