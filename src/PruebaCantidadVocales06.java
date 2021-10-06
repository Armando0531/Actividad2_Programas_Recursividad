import java.util.Scanner;

class ConteoVocales {
	public static int cantidadVocales(String fra,int i,int suma) {
		boolean existenciapoci=true;
		char poci =' ';
		int s = 0;
		try {
			poci=fra.charAt(i);
			existenciapoci=true; 		
		}catch (IndexOutOfBoundsException e) {
			existenciapoci=false;
		}
		if(existenciapoci==true) {
			if(poci=='A'|| poci=='E'||poci=='I'||poci=='O'||poci=='U') {
				s++;
				suma++;
				cantidadVocales(fra, i+1,suma);
				return suma;
			}else {
				cantidadVocales(fra, i+1,suma);
			}
			
		}else {
			System.out.println("Cantidad de vocales es de: "+suma);
			return suma;
		}
		return suma;
	}
}

public class PruebaCantidadVocales06 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa una cadena: ");
		String cadena=entrada.nextLine().toUpperCase();
		ConteoVocales.cantidadVocales(cadena,0,0);

	}

}
