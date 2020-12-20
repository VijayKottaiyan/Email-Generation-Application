package emailApp;

import java.util.*;

public class Email {
    private String firstName, lastName;
    private String department;
    private String companyName = "company" ;
    private String email, password;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 100;
    Scanner scn = new Scanner(System.in);

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Welcome to "+companyName+", "+this.firstName+" "+this.lastName);

        department = setDepartment();
        
        this.email = this.firstName+"."+this.lastName+"@"+department+companyName+".org";
        System.out.println("\nYour mail id : "+this.email);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is : "+password);
    }
    
    private String setDepartment() {
        System.out.println("Select your Department \n 1 - Sales \n 2 - Developement \n 3 - Accounting \n 0 - None");
        System.out.print("\nEnter Your Department Code: ");
        int choice = scn.nextInt();

        if(choice == 1){
            return "sales.";
        }
        else if(choice == 2){
            return "dev.";
        }
        else if(choice == 3){
            return "accnts.";
        }
        else{
            return " ";
        }
    }

    private String randomPassword(int passwordLength){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#!&_";
        char[] password = new char[passwordLength];
        for(int i = 0; i < passwordLength; i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setAlternateMail(String email){
        this.email = email;
    }

    public void setMailCapcity(int Capacity){
        this.mailboxCapacity = Capacity;
    }

    public String getInfo(){
        return "\n\nDisplay Name: "+firstName+" "+lastName+
            "\nMail ID: "+email+
            "\nMail Capacity: "+mailboxCapacity+" Mb";
    }
}