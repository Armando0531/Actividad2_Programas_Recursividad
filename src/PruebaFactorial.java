import java.util.Scanner;

class FactorialRecursivo{
	public static int factorialRecursivo(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorialRecursivo(n-1);
	}
}


public class PruebaFactorial {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		int f=0;
		try {
			f=entrada.nextInt();
			System.out.println("El factorial de "+f+" es: "+FactorialRecursivo.factorialRecursivo(f));
		}catch (NumberFormatException e) {
			System.out.println("Ingresa un numero entero");
		}


	}

}
