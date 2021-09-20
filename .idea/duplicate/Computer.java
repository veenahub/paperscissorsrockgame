package com.example.duplicate;
import java.lang.Math;

/**This program will execute math.random and will give computer choice and it will return it.
 * we will use this computer choice in math logic class and will execute logic and
 * result will store in history.
 */

public class Computer {
    private int computerChoice;
    public void askComputerChoice(){
        //Here math.random() is using for system choice in the game.
        computerChoice = (int) (Math.random() * 3) + 1;
        System.out.println("systemChoice " + computerChoice);
    }
    public int getComputerChoice() {
        return computerChoice;
    }
}

