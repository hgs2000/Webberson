package tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication4.Frase;

public class Tester {

    private static Scanner in = new Scanner(System.in);
    private static ArrayList<Frase> frases = new ArrayList<>();

    public void addFrase(String val, boolean vf) {
        frases.add(new Frase(val, vf));
    }

    public void removeFrase(int id) {
        for (int i = 0; i < frases.size(); i++) {
            if (frases.get(i).getID() == id) {
                frases.remove(i);
                return;
            }
        }
        System.out.println("Nenhum valor inválido ¯\\_( :^) )_/¯");

    }

    private static int nextInt() {
        in.reset();
        try {
            return in.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static String nextLine() {
        in.reset();
        return in.nextLine();
    }

    public static void main(String[] args) {
        boolean continuar = true;
        System.out.println("Nani");
        while (continuar == true) {

            //
            System.out.println("Escolha a opção a ser executada:");
            System.out.println("1 - Mostrar respostas possíveis");
            System.out.println("2 - Adicionar resposta");
            System.out.println("3 - Remover resposta");
            System.out.println("4 - Remover todas as respostas");
            int opcs = nextInt();
            switch (opcs) {
                case 1:
                    System.out.println("Mostrar respostas possíveis");
                    if (!frases.isEmpty()) {
                        for (Frase frase : frases) {
                            System.out.println(frase.getID() + " - " + frase.get());
                        }
                    } else {
                        System.out.println("Não há frases cadastradas.");
                    }
                    break;
                case 2:
                    System.out.println("Adicionar resposta");
                    System.out.println("Escreva a frase a ser adicionada:");
                    System.out.print("Frase: ");
                    String new_frase = nextLine();
                    boolean canBeTrue = true;
                    for (Frase frase : frases) {
                        if (frase.correta() == true) {
                            canBeTrue = false;
                        }
                    }
                    if (canBeTrue == true) {
                        System.out.println("A resposta é a correta? (1 - sim, outros - não)");
                        int yn = nextInt();
                        if (nextInt() != 1) {
                            canBeTrue = false;
                        }
                    }
                    frases.add(new Frase(new_frase, canBeTrue));
                    break;
                case 3:
                    System.out.println("Remover resposta");
                    if (!frases.isEmpty()) {
                        for (Frase frase : frases) {
                            System.out.println(frase.getID() + " - " + frase.get());
                        }
                        System.out.println("Escolha a frase a ser removida");
                        int opc = nextInt();
                        Frase fraseRem = frases.get(opc);
                        if (frases.contains(fraseRem)) {
                            System.out.println("Frase não foi removida :/");
                        }
                    } else {
                        System.out.println("Não há frases cadastradas.");
                    }

                    break;
                case 4:
                    System.out.println("Remover todas as respostas");
                    frases = new ArrayList<>();
                    break;
                default:

            }

            //
            System.out.print("Digite 1 para encerrar o programa, qualquer outra telca para continuar: ");
            int cont;
            System.out.println();
            cont = nextInt();
            if (cont == 1) {
                continuar = false;
                System.out.println("Saindo do programa");
            } else {
                continuar = true;
            }
        }
    }

}
