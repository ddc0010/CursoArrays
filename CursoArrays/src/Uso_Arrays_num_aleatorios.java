
public class Uso_Arrays_num_aleatorios {

	public static void main(String[] args) {
		
		int [] matriz_aleatorios = new int [50];
		
		for(int i = 0; i < matriz_aleatorios.length; i++) {
			matriz_aleatorios[i] = (int)(Math.random()*100); 
		}
		
		for (int numeros : matriz_aleatorios) {
			System.out.println(numeros + " "); 
		}

	}

}
