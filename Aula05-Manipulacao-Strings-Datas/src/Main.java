import java.util.Scanner; // 1. importando a classe Scanner
import java.time.LocalDate; // 1.1 importando a classe LocalDate
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        String nome, testNome;
        Scanner ler = new Scanner( System.in );  // 2. instanciando e criando um objeto Scanner

        System.out.println("Digite a primeira entrada de dados: ");
        nome = ler.nextLine(); // 2. entrada de dados (lendo uma String)

        System.out.println("Digite a segunda entrada de dados: ");
        testNome = ler.nextLine(); // 2. entrada de dados (lendo uma String)

        System.out.println("CapsLock: " + nome.toUpperCase());
        System.out.println("Caixa Baixa: " + nome.toLowerCase());
        System.out.println("Quantidade de Letras: " + nome.length());
        System.out.println("As duas entradas de dados são iguais: " + nome.equals(testNome)+"\n\n");

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        System.out.println("Que dia Numerico do ano e hoje? " + hoje.getDayOfYear()+"°");
        System.out.println("Hoje é dia " + hoje.getDayOfMonth() + " | " + hoje.getDayOfWeek());

        System.out.println("Data inteira: " + hoje);

        Locale brasil = new Locale("pt","BR");
        System.out.println("Traduzido para português Brasil: " + hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        if(agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";
        }
        else if(agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde";
        }
        else if(agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Bom Noite";
        }else {
            saudacao = "Olá.";
        }

        System.out.printf("\n\nOlá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}