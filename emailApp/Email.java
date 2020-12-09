package emailApp;

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

    }
    
    private String setDepartment() {

    }
}
