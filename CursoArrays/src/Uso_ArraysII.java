
public class Uso_ArraysII {

	public static void main(String[] args) {
		
		String [] paises = new String[8]; 
		
		paises[0] = "España";
		paises[1] = "Inglaterra";
		paises[2] = "Francia";
		paises[3] = "Portugal";
		paises[4] = "Suiza";
		paises[5] = "Alemania";
		paises[6] = "Holanda";
		paises[7] = "Belgica";
		
		/* for(int i = 0; i < paises.length; i++) {
			System.out.println("Pais " + (i+1) + " " + paises[i]);
		} */ 
		for (String elemento : paises) {
			System.out.println("Pais: " + elemento);
		}

	}

}
