package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Dungeon {
	Menu menu = new Menu();
    private Board game;
    private int moves;
  

    public Dungeon(int height, int length, int vampires, int moves, boolean vampiresMove) {
        this.game = new Board(length, height, vampires, vampiresMove);
        this.moves = moves;
        
    }

    public void run(Scanner reader) {        
    	int i = moves;
        System.out.println(i);
        game.printBoard();
        while (i > 0) {
            if (this.game.returnCharacters().size() == 1) {
                break;
            }
            String input = reader.nextLine();
            ArrayList<String> orders = new ArrayList<String>();
            for (int j = 0; j < input.length(); j++) {
                orders.add(input.substring(j, j + 1));
            }
            game.moveAndRemoveCharacters(orders);
            i--;
            System.out.println(i);
            game.printBoard();
        }
        if (game.returnCharacters().size() == 1) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("YOU LOSE");
        }
    }
}