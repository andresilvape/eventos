public class Digital {

	public final static int MAX = 10;
	public final static int MIN = 6;

	public Digital(String string) {
	}

	public Digital(int max2) {
	}

	public static boolean validaSenha(String senha) {

		boolean valido = true;

		String reg1 = ".*[A-Za-z].*";
		String reg2 = ".*[0-9].*";

		if (!(senha.length() >= MIN && senha.length() <= MAX)) {
			valido = false;	
			System.out.println("Senha menor ou maior que o permitido");
		}
		if (!senha.matches(reg1)) {
			valido = false;
			System.out.println("Senha Deve possuir uma letra maiuscula");
		}
		if (!senha.matches(reg2)) {
			valido = false;
			System.out.println("Senha deve possuir um numero");
		}
		return valido;
	}

	public static void main(String[] args) {

		Digital s = new Digital(MAX);

		System.out.println(Digital.validaSenha("1234"));

	}
}