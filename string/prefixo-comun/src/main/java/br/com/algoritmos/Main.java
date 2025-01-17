package br.com.algoritmos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight" }));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];


        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return result.append(" ").toString();
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }
}