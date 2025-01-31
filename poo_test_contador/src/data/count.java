package data;

public class count {
	
	
	public void menu() {
		System.out.println("Menu");
		System.out.println("1.Cronometro");
		System.out.println("2.Temporizodar");
	}
	
	public void cuantoseg() {
		System.out.println("Cuantos Segundos");
	}
	
	public void cronometro(int num) {
		try {
			for (int i = 0; i < num; i++) {
				System.out.println(i+1);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
	        System.out.println("El cronómetro fue interrumpido.");
	    }
	}

	public void temporizador(int num) {
		try {
			for (int i = num; i > 0; i--) {
				System.out.println(i-1);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
	        System.out.println("El cronómetro fue interrumpido.");
	    }
	}
}
