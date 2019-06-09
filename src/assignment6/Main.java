package assignment6;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        User st = new User();
        while (true){
            System.out.println("Welcome to Users Management Program");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Show User List");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select from 0 -> 4: ");
            int x = scanner.nextInt();
            if (x == 1){
                st.login();
            } else if (x == 2){
                st.register();
            } else if (x == 3){
                st.showList();
            } else if (x == 4){
                System.out.println("See you agian.");
                break;
            } else {
                System.out.println("Not valid. Please select again.");
            }
        }
    }
}
