package Emailapp;

import java.util.Scanner;

public class Email {
    String firstname;
    String lastname;
    String password;
    String department;
    int mailboxCapacity;
    int defaultPasswordlength =10;
    String alternateEmail;

    //Constructor to receive the first and lastname
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email Created: " + this.firstname + " " + this.lastname);

        //Call a method asking for department and return it
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method to return a Random Password
        this.password = randomPassword(defaultPasswordlength);
        System.out.println("Your Password is: " + this.password);
    }

    //Ask for the Department
    private String setDepartment() {
        System.out.println(" Department Codes\n1 for sales\n2 for Development\n3 for accounting \n0 for nothing\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "Sales"; }
        else if (depChoice == 2) { return "Development"; }
        else if (depChoice == 3) { return "Accounting"; }
        else { return ""; }
    }
    //Generate a Random Password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!§$%&/()=?";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password [i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

}
