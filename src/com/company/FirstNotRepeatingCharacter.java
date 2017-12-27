package com.company;

import java.util.HashMap;

public class FirstNotRepeatingCharacter {

    char firstNotRepeatingCharacter(String s) {

        int length = s.length();
        HashMap<Character, Integer> repeatCheck = new HashMap<>();

        for (int i = 0; i < length; i++) {

            if (repeatCheck.containsKey(s.charAt(i))) {
                repeatCheck.put(s.charAt(i), repeatCheck.get(s.charAt(i)) + 1);
            } else {
                repeatCheck.put(s.charAt(i), 1);
            }
        }

        for (Character key : repeatCheck.keySet()) {
            int value = repeatCheck.get(key);
            if (value == 1) {
                return key;
            }
        }
        return '_';
    }
}
