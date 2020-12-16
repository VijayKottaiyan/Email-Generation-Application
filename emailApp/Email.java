package emailApp;

import java.util.*;

public class Email {
    private String firstName, lastName;
    private String department;
    private String companyName = "AtoZ" ;
    private String email, password;
    private int passwordLength = 10;
    private String alternateEmail;
    private int mailboxCapacity;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Welcome to "+companyName+", "+this.firstName+" "+this.lastName);

        department = setDepartment();
        
        this.email = this.firstName+"."+this.lastName+"@"+department+"."+companyName+".org";
        System.out.println("Your mail id : "+this.email);

        this.password = randomPassword(passwordLength);
        System.out.println("Your password is : "+password);
    }
    
    private String setDepartment() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Select your Department \n 1 - Sales \n 2 - Developement \n 3 - Accounting \n 0 - None");
        int choice = scn.nextInt();
        scn.close();

        if(choice == 1){
            return "sales";
        }
        else if(choice == 2){
            return "dev";
        }
        else if(choice == 3){
            return "accnts";
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
}
