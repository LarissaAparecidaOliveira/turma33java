package ListaExercicioLaco;

import java.util.Scanner;

public class exercicio {

public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double altura, base, areaT;
	
	System.out.println("Digite o valor da base do triangulo retangulo em cent�metros: ");
	base = leia.nextDouble();
	System.out.println("Digite o valor da altura do triangulo retangulo em cent�metros: ");
	altura = leia.nextDouble();
	if(base <=0) {
		System.out.println("Imposs�vel realizar esta opera��o, valor da base est� incorreto!");
	}
	else if(altura <=0) {
	System.out.println("Imposs�vel realizar esta opera��o, valor da altura est� incorreto!");	
	}
	else {
		areaT = base*altura/2;
	
	System.out.println("O valor do c�lculo �: "+areaT);
	}
	
	
	
	
	
}


}
