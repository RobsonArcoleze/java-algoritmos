package br.com.algoritmos;

public class Main {
    public static void main(String[] args) {

        String pass = "Amerca1@";

        boolean matches = pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");

        System.out.println(matches);
    }
}