package es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class app {
    public static List<Integer> generateRandomList(int N) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            int numeroCasuale = random.nextInt(101); 
            lista.add(numeroCasuale);
        }

        return lista;
    }

    public static List<Integer> createInverseList(List<Integer> lista) {
        List<Integer> listaInversa = new ArrayList<>(lista);
        Collections.reverse(listaInversa);
        lista.addAll(listaInversa);

        return lista;
    }

    public static void printEvenOrOdd(List<Integer> lista, boolean pari) {
        System.out.println("Valori in posizioni " + (pari ? "pari:" : "dispari:"));

        for (int i = pari ? 0 : 1; i < lista.size(); i += 2) {
            System.out.println(lista.get(i));
        }
    }

    public static void main(String[] args) {
        int N = 5;
        List<Integer> listaCasuale = generateRandomList(N);

        System.out.println("Lista casuale:");
        System.out.println(listaCasuale);

        List<Integer> listaInversa = createInverseList(listaCasuale);
        System.out.println("Lista con elementi inversi:");
        System.out.println(listaInversa);

        boolean pari = true;
        printEvenOrOdd(listaInversa, pari);
    }
}
