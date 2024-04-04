package winsoftAss;

import java.util.HashMap;

public class assignment_4 {
    public static void findDuplicateCharacters(String ipString) {

        HashMap<Character, Integer> charCntMap = new HashMap<>();

        for (char ch : ipString.toCharArray()) {

            ch = Character.toLowerCase(ch);
            if (charCntMap.containsKey(ch)) {
                charCntMap.put(ch, charCntMap.get(ch) + 1);
            } else {
                charCntMap.put(ch, 1);
            }
        }

        System.out.println("Duplicate characters in the string '" + ipString + "':");
        for (char ch : charCntMap.keySet()) {
            if (charCntMap.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Winsoft Software";
        findDuplicateCharacters(str);
    }
}
