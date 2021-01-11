package Emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    String firstname;
    String lastname;
    String password;
    String email;
    String department;
    int mailboxCapacity =500;
    int defaultPasswordlength =10;
    String alternateEmail;
    String companysuffix = "Myowncompany.de";


    //Constructor to receive the first and lastname
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;


        //Call a method asking for department and return it
        this.department = setDepartment();


        // call a method to return a Random Password
        this.password = randomPassword(defaultPasswordlength);
        System.out.println("Your Password is: " + this.password);
        //Combine elements to generate Email
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companysuffix;

    }

    //Ask for the Department
    private String setDepartment() {
        System.out.println(" New Worker: " + firstname +". Department Codes\n1 for sales\n2 for Development\n3 for accounting \n0 for nothing\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "Sales"; }
        else if (depChoice == 2) { return "Dev"; }
        else if (depChoice == 3) { return "Acct"; }
        else { return ""; }
    }
    //Generate a Random Password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password [i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //set the mailbox capacity
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //change the Password
    public void changepassword( String password) {
        this.password = password;
    }
public int getMailboxCapacity(){ return mailboxCapacity; }
public String getAlternateEmail() {return alternateEmail;}
public String getPassword(){ return password;}

public String showinfo() {
        return "Display Name: " + firstname +  " " + lastname +
                "\nCompany EMail: " + email +
                "\nMailbox Capacity: " + mailboxCapacity + "mb" ;
}
}
