package com.personal;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "aeycompany.com";


    //1. Constructor to receive firstName and lastName
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        //1.1 Call a method asking for the department
        this.department = setDepartment();

        //1.2 Call a method that returns a random password
        this.password = generatePassword(defaultPasswordLength);
        System.out.println("Your password is: "+ this.password);

        //1.3 Combine elements to create email
        email = firstName.toLowerCase() + "." + lastName + "@" + department + "." + companySuffix;


    }

    //2. Ask for the department
    private String setDepartment(){
        System.out.println("New Worker: " + firstName +  "\n_DEPARTMENT CODES_\n1 - Sales\n2 - Development\n3 - Accounting\n0 - none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1){
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        }else {
            return "";
        }
    }


    //3. Generate a random password
    private String generatePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //4. Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    //5. Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //6. Change the password
    public void changePassword(String password){
        this.password = password;
    }

    //8 Get the mailbox capacity
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    //9. get alternate email
    public String getAlternateEmail(){
        return alternateEmail;
    }

    //10. get paasword
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName +" "+ lastName + "\nEMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
