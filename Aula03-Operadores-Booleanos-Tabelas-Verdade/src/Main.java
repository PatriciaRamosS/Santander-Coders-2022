public class Main {
    public static void main(String[] args) {

        //Algoritmo para ir a praia

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println("Vamos a praia? \n"+vamosAPraia);

        /*

        Tabela Verdade
        Operadores Lógicos

        && AND
        || OR

        Operador &&

        true && true = true;
        true && false = false;
        false && true = false;
        false && false = false;

        Operador ||

        true || true = true;
        true || false = true;
        false || true = true;
        false || false = false;

        Operador Ternário

        a sintaxe é:
        (Expressão) ? ValorTrue : ValorFalse
        */

        String mensagem = fimDeSemana ? "É fim de semana." : "Não é fim de semana.";
        //                (expressão) ?      valorTrue     :      valorFalse

        System.out.println("\n" + mensagem);
    }
}