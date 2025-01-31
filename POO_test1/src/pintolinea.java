
public class pintolinea {
	
	private char car='*';
	
	public void imprimirnum(int num) {
	
		for(int i=0; i<(num+2);i++) {
			System.out.print(car);	
		}
		System.out.println();
	}
	
	public void imprimirtxt(String txt) {
		System.out.println(" "+txt);
	}
}
