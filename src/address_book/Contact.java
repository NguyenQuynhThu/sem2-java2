package address_book;


import java.util.HashMap;
import java.util.Scanner;

public class Contact {

    public String name;
    public String phone;

    HashMap<String, String> addressBook = new HashMap<String, String>();

    public Contact(){

    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        addressBook.put(name, phone);
    }

    public void find(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name you want to find: ");
        String name = scanner.nextLine();

        if(addressBook.containsKey(name)) {
            String phone = addressBook.get(name);
            System.out.println("Phone Number of "+name+" is: "+phone);
        } else {
            System.out.println("Not found");
        }
    }

    public void display(){
        System.out.printf("%10s Address Book\n", " ");
        System.out.printf("%-10s | %10s\n", "Contact Name", "Phone number");

        for (String i : addressBook.keySet()) {
            System.out.printf("%-10s | %10s\n", i, addressBook.get(i));
        }
    }
}
