package com.example.duplicate;

/**This program will take player choice and computer choice and
 * will execute logic and will store the result and this result will call in player class
 * and will store in history.
 */
public class MathLogic {
    private String result;
    //It will take player and computer objects as parameter
    public String decideMatchResult(Player player,Computer system) {
        if (player.getPlayerOption() > 0 && system.getComputerChoice() < 4) {
            //This is the Game logic.It will compare player and system choice and display the result
            if (player.getPlayerOption() > system.getComputerChoice()) {
                result = "won";   // will store these result in the array.
                System.out.println(" wow you won");
            } else if (player.getPlayerOption() == system.getComputerChoice()) {
                result = "Draw";
                System.out.println(" Draw");
            } else {
                result = "Loose";
                System.out.println(" Sorry you loose");
            }
        } else {
            System.out.println("Please select the number between 1 to 3");
        }
        return result;
    }
}


