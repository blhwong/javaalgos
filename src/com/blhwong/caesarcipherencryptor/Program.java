package com.blhwong.caesarcipherencryptor;

import java.util.HashMap;
import java.util.Map;

class Program {

    public static String caesarCypherEncryptor(String str, int key) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<Integer, Character> idxToChar = new HashMap<>();
        Map<Character, Integer> charToIdx = new HashMap<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            idxToChar.put(i, c);
            charToIdx.put(c, i);
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int j = (charToIdx.get(c) + key) % 26;
            ans.append(idxToChar.get(j));
        }

        return ans.toString();
    }
}
