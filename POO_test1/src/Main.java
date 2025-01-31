import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Dime una frase");
	String texto= sc.nextLine();
	
	pintolinea pl= new pintolinea();
	
	
	pl.imprimirnum(texto.length());
	pl.imprimirtxt(texto);
	pl.imprimirnum(texto.length());
	
	
	
	}

}
