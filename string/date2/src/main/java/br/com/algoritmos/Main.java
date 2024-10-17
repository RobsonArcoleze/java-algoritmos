package br.com.algoritmos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Date2 date2 = new Date2();

        Date2 dateObj = date2.formatDate2(21, 7, 2010);

        System.out.println(dateObj.getDay() + "/" + dateObj.getMonth() + "/" + dateObj.getYear());
    }
}