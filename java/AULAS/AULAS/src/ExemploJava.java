import java.util.Scanner;

public class ExemploJava {
	
	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int par, impar, numero;
		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if(numero<0) {
		 System.out.println("N�mero negativo!");	
		}
		else if(numero == 0) {
		 System.out.println("N�mero neutro!");	
		}
		else if((numero%2)==0) {
			System.out.println(("N�mero � PAR!"));
		}
		else {
			System.out.println("N�mero � �MPAR!");
		}
	}
	

}
