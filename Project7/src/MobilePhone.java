/*Author Details:
 * Name:Sarika
 * ID:99999-4000
 * Project Description:Building an application for mobile where different operation for contacts is handled.
 */
import java.util.ArrayList;

public class MobilePhone {
	private String myNumber;
	private ArrayList<Contact> myContacts;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}

	public String getMyNumber() {
		return myNumber;
	}

	public boolean addNewContact(Contact contact) {
		boolean addFlag = true;
		String name = contact.getName();
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName().equals(name)) {
				addFlag = false;
				break;
			}
		}
		if (addFlag) {
			myContacts.add(contact);
		}
		return addFlag;
	}

	public boolean updateContact(Contact oldContact, Contact newContact) {
		boolean updateFlag = false;
		String oldName = oldContact.getName();
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName().equals(oldName)) {
				myContacts.remove(i);
				myContacts.add(i, newContact);
				updateFlag = true;
				break;
			}
		}
		return updateFlag;
	}

	public String finndContact(String contactName) {
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName().equals(contactName)) {
				return myContacts.get(i).getPhoneNumber();
			}
		}
		return null;
	}

	public boolean removeContact(Contact contact) {
		boolean removeFlag = false;
		String name = contact.getName();
		for (int i = 0; i < myContacts.size(); i++) {
			if (myContacts.get(i).getName().equals(name)) {
				myContacts.remove(i);
				removeFlag = true;
				break;
			}
		}
		return removeFlag;
	}

	public void printContacts() {
		System.out.println("Contact List");
		for (int i = 0; i < myContacts.size(); i++) {
			System.out.println(
					(i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
		}
	}
}