import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookUC2 {
    static LinkedList<Person> personContact = new LinkedList<Person>();
     static Scanner sc;
    public static void main(String args[]){
        sc = new Scanner(System.in);
        System.out.println("Choose Following options");
        System.out.println("1 : Add New Contact");
        System.out.println("2 : Update Contact");
        System.out.println("3 : Delete Contact");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                addNewContact();
                display();
                break;
            case 2:
                System.out.println("Edit");
                break;
            case 3:
                System.out.println("Delete");
                break;
            default:
                System.out.println("Wrong Input!!");

        }
    }

    private static void display() {
        for(Person p:personContact){
            System.out.println(p.toString());
        }
    }

    private static void addNewContact()
    {
        sc = new Scanner(System.in);
        System.out.println("Enter First_Name:");
        String fname = sc.nextLine();

        System.out.println("Enter Last_Name:");
        String lname = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter city:");
        String city = sc.nextLine();

        System.out.println("Enter State:");
        String state = sc.nextLine();

        System.out.println("Enter Zip_code:");
        int zipCode = sc.nextInt();

        System.out.println("Enter Phone_No:");
        BigInteger phoneNo = sc.nextBigInteger();

        System.out.println("Enter Email_Id:");
        String email = sc.next();

        Person person = new Person(fname,lname,address,city,state,zipCode,phoneNo,email);
        personContact.add(person);

    }
}
