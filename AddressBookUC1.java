import java.math.BigInteger;
import java.util.Scanner;

public class AddressBookUC1 {

    public static void main(String args[]){
        Person person = new Person("Neha","Vatare","Datta Nagar","Pune","Maharastra",416401,new BigInteger("8978905690"),"vatare@gmail.com");
        System.out.println("Contact is : ");
        System.out.println(person.toString());
    }
}
