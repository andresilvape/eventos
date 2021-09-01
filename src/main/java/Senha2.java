public class Senha2 {

		public static boolean validaSenha(String s) {
		boolean valido = true;

		String senha = s;
		String acento = ".*[áéíóúàèìòùâêîôûãõç \\s+\\W+].*+$";
		String number = ".*[_0-9_].*";

		if (!((senha.length() >= 6) && (senha.length() <= 32))) {
			return valido = false;
		}
		if (senha.matches(acento)) {
			return valido = false;
		}
		if (senha.equals(senha.toLowerCase())) {
			return valido = false;
		}
		if (senha.equals(senha.toUpperCase())) {
			return valido = false;
		}
		if (!(senha.matches(number))) {
			return valido = false;
		}
		return valido;
	}
	public static void main(String[] args) {
		/* String[] casos = { "Digital Innovation One", "AbcdEfgh99",
		 * "DigitalInnovationOne123", "Digital Innovation One 123", "Aass9", "Aassd9",
		 * "DIO123456","Ano2020","Digita!123" };
		 * Senha2 s = new Senha2("digDital3");
		 * String resultado = (validaSenha(s)) ? "Senha valida." : "Senha invalida.";
		 * System.out.println(resultado);
		 */
		String[] teste = { "Digital Innovation One", "AbcdEfgh99", "DigitalInnovationOne123",
				"Digital Innovation One 123", "Aass9", "Aassd9" };
		
		
		for (String s : teste) {
		
			String resultado = (validaSenha(s)) ? "Senha valida." : "Senha invalida.";
			System.out.println(resultado);
					}
		
		System.out.println();
		String[] teste2 = { "DIO123456","Ano2020","Digita!123" };
		
		for (String s2 : teste2) {
			String resultado2 = (validaSenha(s2))? "Senha valida." : "Senha invalida.";
			System.out.println(resultado2);
		}
		

	}
}
