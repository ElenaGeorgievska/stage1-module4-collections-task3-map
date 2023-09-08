package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

//Implement the program which gets String sentence as parameter and creates a Map<String,Integer> of word repetition ,
//where key - the word from sentence in lower case, value - the number of repetitions of this word, ignoring case.

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new LinkedHashMap<>();

        StringTokenizer words = new StringTokenizer(sentence, " ");


        // for (Map.Entry<String, Integer> e : result.entrySet()) {

        while (words.hasMoreTokens()) {
            String word = words.nextToken();
            word = word.replace(",", "").replace(".", "");
            word = word.toLowerCase();
            int count = 1;

            if (!result.containsKey(word)) {
                result.put(word, count);
            } else {
                result.put(word, result.get(word) + 1);
            }

        }


        return result;
    }

    public static void main(String[] args) {
        WordRepetitionMapCreator wr = new WordRepetitionMapCreator();

        String wordsSentence = "sentence in loWER caSE, SENTENCE IN UPper CAse.";
        wr.createWordRepetitionMap(wordsSentence);

        System.out.println(wr.createWordRepetitionMap(wordsSentence));
    }
}
