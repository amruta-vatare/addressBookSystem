import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookUC3 {
    static LinkedList<Person> personContact = new LinkedList<Person>();
    static Scanner sc;
    public static void main(String args[]){
        sc = new Scanner(System.in);
        int ch = 0;
        do{
            System.out.println("Choose Following options");
            System.out.println("1 : Add New Contact");
            System.out.println("2 : Update Contact");
            System.out.println("3 : Delete Contact");
            System.out.println("4 : Display ");
            System.out.println("5 : Exit ");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    Person p = addNewContact();
                    personContact.add(p);
                    display();
                    break;
                case 2:
                    System.out.println("Edit");
                    if(updateContact()){
                        System.out.println("Updated Successfully!");
                        display();
                    }else{
                        System.out.println("Not able to update!");
                    }
                    break;
                case 3:
                    System.out.println("Delete");
                    break;
                case 4:
                    display();
                    break;
                default:
                    System.out.println("Wrong Input!!");

            }
        }while(ch != 5 );

    }

    private static boolean updateContact() {
        sc = new Scanner(System.in);
        System.out.println("Choose Name to Update the Contact:");
        for(Person p : personContact){
            System.out.println(p.getFirstName());
        }

        String name = sc.nextLine();
        Person person ;
        for(Person p :personContact){
            if(p.getFirstName().equalsIgnoreCase(name)){
                person = addNewContact();
                if(person != null){
                    p.setFirstName(person.getFirstName());
                    p.setLastName(person.getLastName());
                    p.setAddress(person.getAddress());
                    p.setCity(person.getCity());
                    p.setZipcode(person.getZipcode());
                    p.setState(person.getState());
                    p.setPhoneNo(person.getPhoneNo());
                    p.setEmail_id(person.getEmail_id());
                    return true;
                }
            }
        }
        return false;
    }

    private static void display() {
        for(Person p:personContact){
            System.out.println(p.toString());
            System.out.println("-----------------------------------------------------");
        }

    }

    private static Person addNewContact()
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
        return person;
    }
}
