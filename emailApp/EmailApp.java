package emailApp;

import java.util.*;

class EmailApp{
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        String firstName, lastName;
        System.out.println("\nEnter your first name : ");
        firstName = scn.nextLine();
        System.out.println("\nEnter your last name :");
        lastName = scn.nextLine();
        Email email = new Email(firstName, lastName);
        scn.close();
    }
}