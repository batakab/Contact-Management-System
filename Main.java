package ContactManagementSystem;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Contacts> contacts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            //Display Menu

            System.out.println("Contact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Choose an Option: ");
            int option = Integer.parseInt(sc.nextLine());
            System.out.println();

            switch (option) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String contactName = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = sc.nextLine();
                    contacts.add(new Contacts(contactName, phoneNumber));

                    System.out.println("Contact Added Successfully!\n");
                    break;
                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("Contacts is Empty!");
                    } else {
                        for (int i = 0; i < contacts.size(); i++) {
                            System.out.println((i + 1) + ". " + contacts.get(i));
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("TO SEARCH - Enter name or phone number: ");
                    String search = sc.nextLine();
                    boolean isFound = false;

                    for (Contacts contact : contacts) {
                        if (contact.getName().equalsIgnoreCase(search) || contact.getPhoneNumber().equals(search)) {
                            System.out.println("Contact found: " + contact);
                            isFound = true;
                            System.out.println();
                            break;
                        }
                    }
                    if (!isFound) {
                        System.out.println("No Contacts Found!");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("Enter name or phone number: ");
                    String remove = sc.nextLine();
                    Contacts contactToRemove = null;

                    for (Contacts contact : contacts) {
                        if (contact.getName().equalsIgnoreCase(remove) || contact.getPhoneNumber().equals(remove)) {
                            contactToRemove = contact;
                        }
                    }
                    if (contactToRemove != null) {
                        contacts.remove(contactToRemove);
                        System.out.println("Contacts Removed Successfully!");
                        System.out.println();
                    } else {
                        System.out.println("Contact's not matched!");
                        System.out.println();
                    }

                    break;
                case 5:
                    running = false;
                    System.out.println("GoodBye!");
                    break;
                default:
                    System.out.println("Invalid Option! Please Try Again!");
                    System.out.println();
            }

        }

        sc.close();

    }

}
