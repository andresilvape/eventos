import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    
	    int num = 0,a=0,g=0,d=0;

	    do {
	    	  
	      System.out.println("1 - Alcool");
	      System.out.println("2 - Gaslina");
	      System.out.println("3 - Diesel");
	      
	      num = sc.nextInt();
	      
	      switch (num)
          {
              case 1:
            	  a = a+1;
               	  break;
              case 2:
            	  g = g+1;
            	  break;
              case 3:
            	  d = d+1;
            	  break;
              case 4:
             System.out.println("MUITO OBRIGADO");
                  break;
              default:                       
                  continue;
          }	      
	      
	    } while (num != 4);
	    System.out.println("Alcool:   "+ a);
	    System.out.println("Gasolina: "+ g);
	    System.out.println("Diesel:   "+ d);
	  }
	}