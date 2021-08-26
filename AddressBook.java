package adressbook.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
	ArrayList<Contact> list;

	public AddressBook(ArrayList<Contact> list2) {
		this.list = list2;
	}

	public static void main(String[] args) {

		ArrayList<Contact> list = new ArrayList<Contact>();

		AddressBook adressBook = new AddressBook(list);

		// Adding contact1 in addressBook
		adressBook.addContact();
		// Adding contact2 in addressBook
		adressBook.addContact();

		// using stream to list the elements
		List<Contact> result = list.stream().collect(Collectors.toList());
		System.out.println(result);

	}

	private void addContact() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First name");
		String firstName = s.nextLine();

		System.out.println("Enter the Last name");
		String lastName = s.nextLine();

		System.out.println("Enter the City name");
		String city = s.nextLine();

		System.out.println("Enter the State name");
		String state = s.nextLine();

		System.out.println("Enter the email");
		String email = s.nextLine();

		System.out.println("Enter the Phone number");
		String phoneNumber = s.nextLine();

		System.out.println("Enter the Zip");
		String zip = s.nextLine();
		Contact contact = new Contact(firstName, lastName, city, state, email, phoneNumber, zip);

		list.add(contact);

	}
}