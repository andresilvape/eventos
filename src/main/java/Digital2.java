public class Digital2 {

    public static boolean validaString(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }

public static void main(String[] args) {
	  
 String[] teste = {"Digital Innovation One", "AbcdEfgh99", "DigitalInnovationOne123",
 "Digital Innovation One 123" , "Aass9", "Aassd9", "2342", "abc",};
        //tudo o que não for de a->z ou de A->Z ou de 0->9 será removido
        for(String s: teste){
            String resultado = (validaString(s))?"Senha valida." :"Senha invalida.";
            System.out.println(resultado);
        }
    }
}
