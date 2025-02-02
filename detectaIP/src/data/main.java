package data;

import java.util.Scanner;

/** * 
 * @author Big Henry 
 */

public class main {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Dame una IP");
		String num = sc.nextLine();
		
		DetectaIP chop= new DetectaIP(num);
		
		if (chop.comprobarerrores()) { 
            chop.clasificacion();
        }	

	}

}
