package br.com.algoritmos;

public class DomainEmail{


    public static EmailInfo extractEmailInformation(String email){

        String[] parts = email.split("@");
        String name = parts[0];
        String domain = parts[1];

        boolean isBrazilian = domain.endsWith(".br");

        return new EmailInfo(name, domain, isBrazilian);
    }
}
