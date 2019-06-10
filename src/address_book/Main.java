package address_book;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        Contact contact = new Contact();

        while (true){
            System.out.println("--------- MENU ---------");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select from 0 -> 4: ");
            String  x = scanner.nextLine();
            if (x.equals("1")){
                contact.add();
            } else if (x.equals("2")){
                contact.find();
            } else if (x.equals("3")){
                contact.display();
            } else if (x.equals("4")){
                System.out.println("See you again.");
                System.out.println("------------------------");
                break;
            } else {
                System.out.println("Not valid. Please select again.");
            }
        }
    }
}
