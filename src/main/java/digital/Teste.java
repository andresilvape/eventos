package digital;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);

		    int n = 5; // tamanho do vetor
		    int v[] = new int[n]; // declaração do vetor "v"
		    int i; // índice ou posição
		    int par=0;
		    int imp=0;
		    int pos=0;
		    int neg=0;
		    
		// Entrada de Dados
		    for (i=0; i<n; i++) {
		      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
		      v[i] = ler.nextInt();
		    }
		    
		    for (i=0; i<n; i++) {
		    	
		    	if(v[i] > 0) {
			    	  pos++;
		    	  }
			    if (v[i] < 0){
			    	  neg++;
			       }
			    if(v[i]%2 == 0) {
			    	  par++;
			    	  }	
			    else {
			    	  imp++;
			    	  }
	    }
		    System.out.println(par + " valor(es) par(es)");
		    System.out.println(imp + " valor(es) impar(es)");
		    System.out.println(pos + " valor(es) positivo(s)");
		    System.out.println(neg + " valor(es) negativo(s)");
		}
}
		