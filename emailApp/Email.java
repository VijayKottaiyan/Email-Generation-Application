package emailApp;

import java.util.*;

public class Email {
    private String firstName, lastName;
    private String department;
    private String companyName = "A to Z" ;
    private String password;
    private String alternateEmail;
    private int mailboxCapacity;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Welcome to "+companyName+", "+this.firstName+" "+this.lastName);

        department = setDepartment();
    }
    
    private String setDepartment() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Select your Department \n 1 - Sales \n 2 - Developement \n 3 - Accounting \n 0 - None");
        int choice = scn.nextInt();
        
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
}
