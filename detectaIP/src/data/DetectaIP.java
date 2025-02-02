package data;


public class DetectaIP {
	String[] num;  

	
	public DetectaIP(String num) {
		this.num = num.split("\\.");
	
	}
	
	public boolean comprobarerrores() {
		for (int i = 0; i < 4; i++) {
			int comprueba= Integer.parseInt(this.num[i]);
			
			if (comprueba >255) {
				System.out.println("El octeto "+(i+1)+" es incorrecto" );
			return false;
			};
			
		}
		return true;	
	}

	public void clasificacion () {
		
		int primerapart= Integer.parseInt(this.num[0]);
		
		
		if (primerapart>=0 && primerapart<=127) {
			System.out.println("La IP que me has dado es Clase A");
		}
		
		if (primerapart>=128 && primerapart<=191) {
			System.out.println("La IP que me has dado es Clase B");
		}
		
		if (primerapart>=192 && primerapart<=223) {
			System.out.println("La IP que me has dado es Clase C");
		}
		
		if (primerapart>=224 && primerapart<=239) {
			System.out.println("La IP que me has dado es Clase D");
		}
		
		if (primerapart>=240 && primerapart<=255) {
			System.out.println("La IP que me has dado es Clase E");
		}
	}
}
