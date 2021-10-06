import java.util.Scanner;

class DivisoresComunes{
	
	public void mostrarDivisores(int a, int b, int it, int cnt) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		if(it<min) {
			it+=1;
			mostrarDivisores(a, b, it, cnt);
		}else if(min<=it&&it<=max) {
			if(max%it==0) {
				System.out.println(it);
				cnt+=1;
			}
			it+=1;
			mostrarDivisores(a, b, it, cnt);
		}else {
			System.out.println("cantidad de divisores : "+cnt);
		}
	
	}
	
}

public class Divisores_Enteros04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DivisoresComunes dc = new DivisoresComunes();
		
		System.out.println("Ingrese el primer valor: ");
		int num1=entrada.nextInt();
		System.out.println("Ingrese el segundo  valor: ");
		int num2=entrada.nextInt();
		
		dc.mostrarDivisores(num1, num2, 0, 0);
		

	}

}
