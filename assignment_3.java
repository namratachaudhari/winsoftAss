//Write a Java Program to count the number of words in a string using HashMap.

package winsoftAss;

import java.util.HashMap;

public class assignment_3 {
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String inputString = "This is a Assignment4 for winnsoft round";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : inputString.split("\\s+")) {
            word = word.toLowerCase();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        int totalWords = countWords(inputString);
        System.out.println("Total Number of Words: " + totalWords);
    }
}
