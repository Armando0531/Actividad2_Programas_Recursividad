import java.util.Scanner;

class DivisoresRecursivos {
	public static void mostrarDivisores(int num,int a) {
		if(num>1) {
			if(num%a==0) {
				System.out.println(a);
				mostrarDivisores(num, a+1);
			}else if((a+1)<=num){
				mostrarDivisores(num, a+1);
			}
			if(num==1) {
				System.out.println(num);
			}
		}
	}
}

public class PruebaDivisores {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		int n=0;
		try {
			n=entrada.nextInt();
		}catch (NumberFormatException e) {
			System.out.println("No ingresaste un numero entero");
		}
		System.out.println("Los divisores del numero son: ");
		DivisoresRecursivos.mostrarDivisores(n,2);

	}

}
