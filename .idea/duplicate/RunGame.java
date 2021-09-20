package com.example.duplicate;

/** This program allow us to play Bag,Scissors,Rock game and this programme  is the entry point the game
 *  we will create object for Menu and we will call it as a startMenu.
 *  Using object we will call menu method then
 *  you will get menu which shows 1.Newmatch 2.History 3.Endgame
 */

public class RunGame {
    public static void main(String[] args) {
        Menu startMenu = new Menu(); // creating object for menu class
        startMenu.printMainMenu();   //calling the printmainmenu method using menu object.
    }
}
