package emailApp;

import java.util.*;

class EmailApp{
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        String firstName, lastName, mailID, password;
        int choice, capacity;
        System.out.print("Enter your first name: ");
        firstName = scn.nextLine();
        System.out.print("\nEnter your last name: ");
        lastName = scn.nextLine();
        System.out.println();
        Email email = new Email(firstName, lastName);
        System.out.println("\n\n~~~ Action Center ~~~");
        
        do{
            System.out.print("\n1 to Change Mail ID \n2 to Change Password \n3 to change MailBox Capacity \n0 to Exit \n\nWhat do you want to Do?  ");
            choice = scn.nextInt();
            
            if(choice == 1){
                System.out.print("Enter the Mail ID: ");
                mailID = scn.next();
                email.setAlternateMail(mailID);
            }
            else if(choice == 2){
                System.out.print("Enter Password: ");
                password = scn.next();
                email.setPassword(password);
            }
            else if(choice == 3){
                System.out.print("Enter the limit of your Mailbox: ");
                capacity = scn.nextInt();
                email.setMailCapcity(capacity);
            }
            else{
                System.out.println("Exited the Action center!");
            }
        }while(choice != 0);

        do{
            System.out.println("\n\nTo display Info --- Press 1 \nTo Exit --- Press 0 \n\nWaiting for you to Press......");
            choice = scn.nextInt();

            if(choice == 1){System.out.println(email.getInfo());}
            if(choice != 0 && choice != 1){
                System.out.println("\n\nOhh!! You have not pressed 1 or 0\nuntil you press 0 or 1, your going to be stuck in loop\n");
            }
        }while(choice !=0);
        scn.close();
    }
}