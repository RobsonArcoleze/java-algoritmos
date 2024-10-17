package br.com.algoritmos.string;

public class Main {
    public static void main(String[] args) {

// Problema "cpf"
// Dado o CPF de uma pessoa, o qual pode conter pontos ou traços como separadores, retorne o CPF contendo somente dígitos.

// Exemplo 1:
// Entrada 87409217293 Saída 87409217293

// Exemplo 2:
// Entrada 874092172-93 Saída 87409217293

// Exemplo 3:
// Entrada 874.092.172-93 Saída 87409217293

        String input1 = "87409217293";
        String input2 = "874092172-93";
        String input3 = "874.092.172-93";

        System.out.println(input3.replaceAll("\\D", ""));

    }
}