/*Author Details:
 * Name:Sarika
 * ID:99999-4000
 * Project Description:Building an application for mobile where different operation for contacts is handled.
 */
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your phone number:");
		String myNumber = userInput.nextLine();
		MobilePhone mobilePhone = new MobilePhone(myNumber);
		printMenu();
		while (true) {
			System.out.println("Enter action: (6 to show available actions.)");
			int action = userInput.nextInt();
			userInput.nextLine();
			if (action == 0) {
				System.out.println("Quit the program...");
				break;
			} else if (action == 1) {
				mobilePhone.printContacts();
			} else if (action == 2) {
				System.out.println("Enter new contact name:");
				String name = userInput.nextLine();
				System.out.println("Enter phone number:");
				String phoneNumber = userInput.nextLine();
				Contact newContact = new Contact(name, phoneNumber);
				if (mobilePhone.addNewContact(newContact)) {
					System.out.println("New contact added: name = " + name + " , phone = " + phoneNumber);
				} else {
					System.out.println("Contact is already on file.");
					System.out.println("Cannot add, " + name + " already on file");
				}
			} else if (action == 3) {
				System.out.println("Enter existing contact name:");
				String oldName = userInput.nextLine();
				String oldPhoneNumber = mobilePhone.finndContact(oldName);
				if (oldPhoneNumber != null) {
					System.out.println("Enter new contact name:");
					String newName = userInput.nextLine();
					System.out.println("Enter new contact phone number:");
					String phoneNumber = userInput.nextLine();
					Contact oldContact = new Contact(oldName, "");
					Contact newContact = new Contact(newName, phoneNumber);
					if (mobilePhone.updateContact(oldContact, newContact)) {
						System.out.println(oldName + " was replaced with " + newName);
						System.out.println("Successfully updated record.");
					} else {
						System.out.println("Contact not found.");
					}
				} else {
					System.out.println("Contact not found.");
				}
			} else if (action == 4) {
				System.out.println("Enter existing contact name:");
				String name = userInput.nextLine();
				Contact contact = new Contact(name, "");
				if (mobilePhone.removeContact(contact)) {
					System.out.println(name + " was deleted");
					System.out.println("Successfully deleted.");
				} else {
					System.out.println("Contact not found.");
				}
			} else if (action == 5) {
				System.out.println("Enter existing contact name:");
				String name = userInput.nextLine();
				if (mobilePhone.finndContact(name) != null) {
					System.out.println("Name: " + name + " phone number is " + mobilePhone.finndContact(name));
				} else {
					System.out.println("Contact not found.");
				}
			} else if (action == 6) {
				printMenu();
			}
		}
		userInput.close();
	}

	public static void printMenu() {
		System.out.println("\npress:");
		System.out.println("0 - to quit the program");
		System.out.println("1 - to print contacts");
		System.out.println("2 - to add a new contact");
		System.out.println("3 - to update existing an exsiting contact");
		System.out.println("4 - to remove an existing contact");
		System.out.println("5 - search if an existing contact exists");
		System.out.println("6 - to print a list of available actions");
		System.out.println("Choose your action:");
	}
}