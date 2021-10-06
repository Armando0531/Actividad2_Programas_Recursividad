import java.util.Scanner;

class Conversor{
	public static void conversorDecimalBinario(double num,int n) {
		int x=(int) (num%2);
			double f=num/2;
			if(f>=0.5) {
			if(num%2==0 || num%2==1) {
				n=(int) (num/2);
				conversorDecimalBinario(n,0);
				System.out.print(x);
			}else {
				conversorDecimalBinario(n,0);
			}
		}
		
	}
}

public class CoversionDecimal05 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		double n=entrada.nextInt();
		System.out.println("El numero convertido a binario es:");
		Conversor.conversorDecimalBinario(n,0);

	}

}
