package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		
		Calendar c = new Calendar(reader);
		
		System.out.println(c.anioBisiesto(2000));
		System.out.println(c.calcularDias(19,10,2019));

	}

}
