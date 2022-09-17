import java.util.Scanner; // 1. importando a classe Scanner

/*
public class Main {
    public static void main(String[] args) {
        String nomeOriginal;
        Scanner ler = new Scanner( System.in );

        System.out.println("Digite: ");
        nomeOriginal = ler.nextLine();

        saudacao(nomeOriginal);
    }
    public static void saudacao(String nomeParametro) {
        System.out.println("Hello, " + nomeParametro);
    }
}
*/

public class Main {
    public static void main(String[] args) {

        int resultado = soma(2, 3);

        System.out.println(resultado);
    }

    public static int soma(int a, int b) {
        return a+b;
    }
}