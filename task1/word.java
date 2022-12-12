package lesson_4.task1;

import java.util.ArrayList;
import java.util.HashMap;

public class word {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Апельсин");
        words.add("Яблоко");
        words.add("Арбуз");
        words.add("Апельсин");
        words.add("Фейхоа");
        words.add("Фейхоа");
        words.add("Дыня");
        words.add("Дыня");
        words.add("Яблоко");
        words.add("Арбуз");
        words.add("Банан");
        words.add("Апельсин");
        words.add("Виноград");
        words.add("Виноград");
        words.add("Киви");

        HashMap<String, Integer> allWords = new HashMap<>();
        for (String word: words) {
            if (!allWords.containsKey(word)) {
                allWords.put(word, 1);
            } else {
                int value = allWords.get(word);
                allWords.replace(word, ++value);
            }
        }
        System.out.println(words);
        System.out.println(allWords);
    }
}

