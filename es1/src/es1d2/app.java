package es1d2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di elementi da inserire nell'HashSet:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Set<String> distinctWords = new HashSet<>();
        Map<String, Integer> wordCounts = new HashMap<>();

        System.out.println("Inserisci " + n + " parole:");
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            distinctWords.add(word);
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        System.out.println("Parole duplicate:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " (x" + entry.getValue() + ")");
            }
        }

        System.out.println("Numero di parole distinte: " + distinctWords.size());

        System.out.println("Elenco delle parole distinte:");
        for (String word : distinctWords) {
            System.out.println(word);
        }
    }
}