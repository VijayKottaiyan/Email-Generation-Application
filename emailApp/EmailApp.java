package emailApp;

import java.util.*;

class EmailApp{
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        String firstName, lastName;
        System.out.print("Enter your first name : ");
        firstName = scn.nextLine();
        System.out.print("\nEnter your last name : ");
        lastName = scn.nextLine();
        System.out.println();
        Email email = new Email(firstName, lastName);
        scn.close();
    }
}