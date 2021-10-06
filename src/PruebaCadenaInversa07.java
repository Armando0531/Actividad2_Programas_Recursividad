import java.util.Scanner;
class CadenaInvertida{
	public static void mostrarCadenaInvertida(String cad,int p) {
		if(p>=0) {
			System.out.print(cad.charAt(p));
			mostrarCadenaInvertida(cad, p-1);
		}
		System.out.println();
	}
}

public class PruebaCadenaInversa07 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa la cadena");
		String cadena=entrada.nextLine();
		System.out.println("Cadena invertida:");
		CadenaInvertida.mostrarCadenaInvertida(cadena, cadena.length()-1);

	}

}
