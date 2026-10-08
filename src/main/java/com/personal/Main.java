package com.personal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Email email = new Email("John","Smith");
        email.setAlternateEmail("johnny.thegoat@gmail.com");
        System.out.println("Alt Email: "+ email.getAlternateEmail());
        System.out.println("---------------------------------------");
        System.out.println(email.showInfo());
    }
}