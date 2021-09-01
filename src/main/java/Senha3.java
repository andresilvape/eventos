import java.util.Scanner;

public class Senha3 {
	
	String senha;
	
 public Senha3(String senha) {
	 this.senha= senha;
		
	}

public static void main(String[] args) {

	 	Scanner sc = new Scanner(System.in);
		
	    String senha = sc.nextLine();
	    
	    if(senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,32}$")){
			System.out.println("Senha valida.");
			
		if(senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,32}$")){
			System.out.println("Senha valida.");
		}
		}else{
			System.out.println("Senha invalida.");
		}
	}

}
