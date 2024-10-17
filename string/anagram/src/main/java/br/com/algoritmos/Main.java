package br.com.algoritmos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(isAnagram("amor", "roma"));
    }

    public static Boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            System.out.println("cai aqui");
            return false;
        }

        char[] palavra1 = a.toLowerCase().toCharArray();
        char[] palavra2 = b.toLowerCase().toCharArray();

        Arrays.sort(palavra1);
        Arrays.sort(palavra2);

        return Arrays.equals(palavra1, palavra2);
    }
}