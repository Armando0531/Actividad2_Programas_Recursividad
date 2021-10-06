import java.util.Scanner;

class MostrarCocientesEnteros{
	
	public void mostrarCocientes(String dividendo, int divisor, int ln, int residuo) {
		String Divisor=Integer.toString(divisor);
		if(Divisor.length()<=dividendo.length()) {
			if(ln<=(dividendo.length()-Divisor.length())) {
				int div=Integer.parseInt(dividendo.substring(ln,(ln+Divisor.length())));
				div = (int) (div + (residuo*10));
				System.out.print("cociente "+(ln+1)+": ");
				System.out.println(div/divisor);
				residuo=div%divisor;
				String temp=dividendo.substring(0,ln);
				for (int i = ln; i < ln+Divisor.length(); i++) {
					temp+='0';
				}
				temp+=dividendo.substring(ln+Divisor.length());
				dividendo=temp;
				ln+=1;
				mostrarCocientes(dividendo,divisor,ln,residuo);
			}else {
				System.out.println("residuo: "+residuo);
			}
		}else {
			System.out.println("no se puede obtener cocientes enteros");
		}
	}
}


public class cocientes_Enteros {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		MostrarCocientesEnteros ce= new MostrarCocientesEnteros();
		
		System.out.println("Ingresa el primer numero: ");
		String  num1=entrada.next();
		System.out.println("Ingresa el segundo  numero: ");
		int num2=entrada.nextInt();
		
		ce.mostrarCocientes(num1, num2,0,0);

	}

}
