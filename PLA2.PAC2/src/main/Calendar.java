package main;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calendar {
	
	
	private Scanner reader;
	
	
	public Calendar(Scanner reader) {
		this.reader = reader;
		
	}
	
	public void leerFecha() {
		System.out.println("Day: ");
		int day = Integer.parseInt(reader.nextLine());
		System.out.println("Month: ");
		int month = Integer.parseInt(reader.nextLine());
		System.out.println("Year: ");
		int year = Integer.parseInt(reader.nextLine());
		validarFecha(day, month, year);
		//calcularDias(day,month,year);
	}
	
	public int validarFecha(int day, int month, int year) {
		if (year < 1978) {
            System.out.println("Incorrect.");
        } 
		try {
        LocalDate today = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(today));
        return 1;
    }catch(Exception e){
    	System.out.println("Incorrect.");
    	return 0;
    }
	
		
	}
	
	public int anioBisiesto(int year) {
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
			return 1;
		else
			return 0;	}
	
	public String calcularDias (int day, int month, int year) {
		java.util.GregorianCalendar date=new java.util.GregorianCalendar(year,month,day);
		java.util.GregorianCalendar date2=new java.util.GregorianCalendar(1978,1,1);
		long difms=date.getTimeInMillis() - date2.getTimeInMillis();
		long difd= difms / (1000 * 60 * 60 * 24);		
		if(difd%7==0) {
			return difd + ", ese dia fue domingo.";			
		}else if((difd-1)%7==0) {
			return  difd  + ", ese dia fue lunes.";			
		}else if((difd-2)%7==0) {
			return  difd  + ", ese dia fue martes.";
		}else if((difd-3)%7==0) {
			return  difd  + ", ese dia fue miércoles.";
		}else if((difd-4)%7==0) {
			return  difd  + ", ese dia fue jueves.";
		}else if((difd-5)%7==0) {
			return difd  + ", ese dia fue viernes.";
		}else {
			return difd  + ", ese dia fue sábado.";
		}
		
	}	
}