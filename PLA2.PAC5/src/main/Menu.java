package main;

import java.util.Scanner;

public class Menu {

	public Menu() {
		
	}
	
	public void selectDifficulty(Scanner reader) {
		System.out.println("---------------------");
		System.out.println("--  D U N G E O N  --");
		System.out.println("---------------------");
		System.out.println();
		System.out.println("Select difficulty: ");
		System.out.println("a) Easy (50 moves)");
		System.out.println("b) Medium (30 moves)");
		System.out.println("c) Hard (15 moves)");
		String response = reader.nextLine();
		if(response.contentEquals("a")) {
			Dungeon d = new Dungeon(10,10,5,50,true);
			d.run(reader);
		}else if(response.contentEquals("a")) {
			Dungeon d = new Dungeon(10,10,5,30,true);
			d.run(reader);
	}else if(response.contentEquals("a")) {
		Dungeon d = new Dungeon(10,10,5,15,true);
		d.run(reader);
	}else {
		System.out.println("Incorrect. Write a, b or c.");
		response = reader.nextLine();
	}
}
}