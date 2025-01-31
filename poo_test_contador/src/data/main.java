package data;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		count yep = new count();
		Scanner sc= new Scanner(System.in);
		
		
		yep.menu();
		int num= sc.nextInt();
		
		switch (num) {
		case 1:
			yep.cuantoseg();
			int caso1= sc.nextInt();
			yep.cronometro(caso1);
			break;

		case 2:
			yep.cuantoseg();
			int caso2= sc.nextInt();
			yep.temporizador(caso2);
			break;
		}
		
		System.out.println();

		
	}

}
