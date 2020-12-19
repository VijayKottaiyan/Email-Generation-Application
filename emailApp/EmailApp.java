package emailApp;

import java.util.*;

class App{
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        String firstName, lastName;
        int choice;
        System.out.print("Enter your first name: ");
        firstName = scn.nextLine();
        System.out.print("\nEnter your last name: ");
        lastName = scn.nextLine();
        System.out.println();
        Email email = new Email(firstName, lastName);
        System.out.println("~~~ Action Center ~~~");
        email.dispMenu();
        do{
            System.out.println("To display Info --- Press 1 \nTo Exit --- Press 0 \nWaiting for you to Press......");
            choice = scn.nextInt();
            if(choice != 0 && choice != 1){
                System.out.println("Ohh!! You have not pressed 1 or 0\nuntil you press 0 or 1, your going to be stuck in loop");
            }
        }while(choice !=0);
        scn.close();
    }
}