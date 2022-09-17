import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[5]; //Array com 05 posições
        // [0]  [1]  [2]  [3]  [4]

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for(int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("\n");
        /*
        String[] letras = new String[5]; //Array com 05 posições
        // [0]  [1]  [2]  [3]  [4]


        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";
        */

        String[] letras = {"A", "B", "C", "D", "E"};

        for(int i=0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println("\n");

        System.out.println(Arrays.toString(letras));

        int[] auxiliar = {9, 10, 12, 25, 2};
        int maior = auxiliar[0], menor = auxiliar[0], media = 0;
        int j;
        for(j=0; j < letras.length; j++) {
            if(auxiliar[j] > maior) {
                maior = numeros[j];
            }
            if(auxiliar[j] < menor) {
                menor = auxiliar[j];
            }
            media += auxiliar[j];
        }
        System.out.println("\n");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + (float)media/auxiliar.length);
    }
}