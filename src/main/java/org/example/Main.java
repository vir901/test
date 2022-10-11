package org.example;

public class Main {
    public static void main(String[] args) {

        FacebookAuthProviderImpl fapi = new FacebookAuthProviderImpl();
        System.out.println(fapi.sign("flsken"," lfseknlsknef"));
    }
}