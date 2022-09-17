
import java.util.Scanner; // 1. importando a classe Scanner

public class Main {
    public static void main(String[] args) {

        Scanner nota = new Scanner( System.in );  // 2. instanciando e criando um objeto Scanner

        int exame1, exame2, exame3, media;
        String aux;

        System.out.println("A média final será composta pelas notas dos Exames aplicados no decorrer do semestre.");

        System.out.println("Digite a nota do Exame 1: ");
        exame1 = nota.nextInt();

        System.out.println("Digite a nota do Exame 2: ");
        exame2 = nota.nextInt();

        System.out.println("Digite a nota do Exame 3: ");
        exame3 = nota.nextInt();

        media = ((exame1 + exame2 + exame3)/3);

        //nota maior ou igual a 70, então aluno aprovado
        if(media >= 60) {
            aux = "A";
        }
        else if((media >= 50)&&(media < 59.9)){
            aux = "B";
        }else if((media < 49.9)&&(media >= 0)){
            aux = "C";
        }
        else {
            aux = "D";
        }

        switch (aux) {
            case "A":
                System.out.println("Média: " + media);
                System.out.println("Aluno Aprovado!");
                break;
            case "B":
                System.out.println("Média: " + (float)media);
                System.out.println("Aluno de Recuperação!");
            case "C":
                System.out.println("Média: " + (float)media);
                System.out.println("Aluno de Reprovado!");
            case "D":
                System.out.println("ERROR!");
        }
    }
}