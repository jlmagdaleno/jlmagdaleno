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
		while(true) {
			String response = reader.nextLine();
		if(response.contentEquals("a")) {
			Dungeon d = new Dungeon(10,10,5,50,true);
			d.run(reader);
			break;
		}else if(response.contentEquals("b")) {
			Dungeon d = new Dungeon(10,10,5,30,true);
			d.run(reader);
			break;
	}else if(response.contentEquals("c")) {
		Dungeon d = new Dungeon(10,10,5,15,true);
		d.run(reader);
		break;
	}else {
		System.out.println("Incorrect. Select a, b or c.");
	}
	}
}
}