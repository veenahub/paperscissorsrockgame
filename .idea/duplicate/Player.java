package com.example.duplicate;
import java.util.ArrayList;
import java.util.Scanner;

/**This program allow user to enter his option and storew it
 *
 */
public class Player {
    Scanner userInput = new Scanner(System.in);
    private ArrayList<String> gameResult = new ArrayList<String>(); // created arraylist to store the game result.
    private int playerOption;
    int i = 0;
    public void askPlayerChoice() {
        playerOption = userInput.nextInt();
    }
    public int getPlayerOption() {
        return playerOption;
    }
    public void printMatchHistory() {
        boolean empty = true;
        // It will check whether array have any values or not
        while (gameResult.size() == 0) {
            empty = false;
            break;
        }
        while (empty == false) {
            System.out.println("You don't have any history. First play the game and come back");
            break;
        }
        //if array have any values it will print that values
        for(String j:gameResult) {
            if(j!= null)
                System.out.println(j);
        }

    }
    public void addMatchToHistory(String result) {
        gameResult.add(i++, result); //Storing game result in the array for history.
    }
}
