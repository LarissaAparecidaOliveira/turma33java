import java.util.Scanner;

public class Exercicio8 {

	//O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	//percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.


      public static void main (String[] args) {
    	  
    	  
       Scanner leia = new Scanner(System.in);
       
       double distribuidor, imposto, fabrica, consumidor;
       
       System.out.println("Digite o custo do ve�culo: ");
       fabrica = leia.nextDouble();
      
       distribuidor = fabrica + (fabrica * 28/100);
       imposto = fabrica + (fabrica * 45/100);
       consumidor = fabrica + distribuidor + imposto;
       
       System.out.println("O custo do consumidor ser� de: "+consumidor);
      
      
      
      
      
      
      
      
      
      
      }




}
