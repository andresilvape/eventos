import java.util.Scanner;

public class Senha4 {
	   public static boolean validaSenha(String str) {
	        return str.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,32}$");
	    }
	   
	public static void main(String[] args) {
		
		 String[] teste = {"Digital Innovation One", "AbcdEfgh99", "DigitalInnovationOne123",
				 		   "Digital Innovation One 123", "Aass9", "Aassd9", "7Andre"};
				    		
			for(String resp1 : teste) {			
				String resp = (validaSenha(resp1)) ? "Senha valida." : "Senha invalida.";
				System.out.println(resp);	
			}	
	}
}
