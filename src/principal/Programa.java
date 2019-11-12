package principal;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);  
       
		System.out.println("Digite o número de números : ");
		int n = sc.nextInt();
	
		int valor[] = new int[n];  
 		
        // recebe valores
        for(int i = 0; i < valor.length; i++){  
            System.out.println((i+1)+"º valor: ");  
            valor[i] = sc.nextInt();  
        }  

        // maior
        int maior = valor[0];
        for (int i = 1 ; i < valor.length; i++){
          if ( valor[i] > maior) {
             maior = valor[i];
          }
        }

        //menor
        int menor = valor[0];
        for (int i = 1; i < valor.length; i++) {  
          if(valor[i] < menor){  
            menor = valor[i];  
          }  
        }
        
        System.out.println("Maior valor : "+ maior);  
        System.out.println("Menor valor : "+ menor);  
   		
		sc.close();
		
	}

}
