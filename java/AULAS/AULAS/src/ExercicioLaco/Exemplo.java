package ExercicioLaco;

import java.util.Scanner;

public class Exemplo {


public static void main (String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int n1, n2, n3;
	
	System.out.println("Digite o primeiro n�mero: ");
	n1 = leia.nextInt();
	
	System.out.println("Digite o segundo n�mero: ");
	n2 = leia.nextInt();
	
	System.out.println("Digite o terceiro n�mero: ");
	n3 = leia.nextInt();
	
	if((n1 > n2) && (n1 > n3)) {
	    System.out.println("O n�mero maior � o primeiro! ");
	}
	else if((n2 > n1) && (n2 > n3)) {
		System.out.println("O n�mero maior � o segundo! ");
	}
	else if((n3 > n1) && (n3 > n2)) {
	System.out.println("O n�mero maior � o terceiro! ");
	}
	
}

}
