package exemplo;

import java.util.Scanner;

public class ExercicioEnquanto {


public static void main(String[] args) {
	
   Scanner leia = new Scanner(System.in);
   
  double somatoria=0.00, media, numero=0.00, total=0.00;
   
   while(numero >= 0) {
	   System.out.println("Digiteo um n�mero a ser somado: ");
	   numero = leia.nextDouble();
	   System.out.println("Digiteo um n�mero a ser somado: ");
	   numero = leia.nextDouble();
	   System.out.println("Digiteo um n�mero a ser somado: ");
	   numero = leia.nextDouble();	  
	   somatoria = somatoria+numero;
	   total=total+1; 
	   media = somatoria/total;
	   
	   if(numero<0) {
		  System.out.println("N�mero inv�lido. Digite um n�mero positivo!");   
	   }
        System.out.println("A somat�ria dos n�meros �: "+somatoria);
	    System.out.println("A m�dia dos valores �: "+media);
	    System.out.println("O total de n�meros �: "+total);
   
	    
   }
   





 
	
	
  }


}
