package tests;

import java.util.ArrayList;
import javaapplication4.Frase;

public class Test1 {

    static ArrayList<Frase> frases = new ArrayList<>();

    public static void main(String[] args) {
        frases.add(new Frase("Mitos e lendas indígenas provocaram mudanças na cultura religiosa portuguesa do século XVI, em Portugal.", true));
        frases.add(new Frase("A pesca, a caça e os frutos do Brasil serviram como base alimentar na culinária colonial luso-brasileira.", false));
        frases.add(new Frase("O uso do algodão entre os nativos brasileiros para a fabricação de redes foi reutilizado pelos colonos portugueses para a confecção de tecidos rústicos.", false));
        frases.add(new Frase("O cultivo entre algumas tribos brasileiras de frutas, milho e tubérculos foi rapidamente incorporado à agricultura de subsistência entre colonos portugueses.", false));
        frases.add(new Frase("A cultura do fumo utilizada por nativos brasileiros tornou-se um dos hábitos culturais mais apreciados pelos europeus.", false));

        printFilter("nativos");
    }

    public static void printFilter(String filter) {
        ArrayList<Frase> filtrados = new ArrayList<>();
        for (Frase frase : frases) {
            if (frase.get().contains(filter)) {
                filtrados.add(frase);
            }
        }
        System.out.println();
        for (Frase filtrado : filtrados) {
            System.out.println(filtrado.get());
        }
    }

}
