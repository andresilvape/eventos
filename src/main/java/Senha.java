public class Senha {

	private String senha;

	public Senha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static boolean validaSenha(String s) {

		boolean valido = true;

		String senha = s;
		String acento = ".*[áéíóúàèìòùâêîôûãõç \\s+\\W+].*+$";
		String number = ".*[_0-9_].*";

		if (!((senha.length() >= 6) && (senha.length() <= 10))) {
			// System.out.println("Tamanho Incorreto");
			// System.out.println("Senha invalida.");
			return valido = false;
		}
		if (senha.matches(acento)) {
			// System.out.println("Possui acento ou caracter");
			// System.out.println("Senha invalida.");
			return valido = false;
		}
		if (senha.equals(senha.toLowerCase())) {
			// System.out.println("possui uma ou mais minuscula");
			// System.out.println("Senha invalida.");
			return valido = false;
		}
		if (senha.equals(senha.toUpperCase())) {
			// System.out.println("possui uma ou mais Maiuscula");
			// System.out.println("Senha invalida.");
			return valido = false;
		}

		if (!(senha.matches(number))) {
			// System.out.println("Possui letras e numeros");
			// System.out.println("Senha invalida.");
			return valido = false;
		}

		return valido;
	}

	public static void main(String[] args) {

		String[] casos = { "Digital Innovation One", "AbcdEfgh99", "DigitalInnovationOne123",
				"Digital Innovation One 123", "Aass9", "Aassd9", "DIO123456","Ano2020","Digita!123" };
		
		for (String s : casos) {
			String resultado = (validaSenha(s)) ? "Senha valida." : "Senha invalida.";
			System.out.println(resultado);
		}
	}}
