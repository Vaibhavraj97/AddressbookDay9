package com.bridgelabz.Addressbook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBookEntry {

	    private static ArrayList<String>[] address_bookentry;
		private static ArrayList<String>[] address_book;
		private String firstname;
		private String lastname;
		private int streetno;
		private String street;
		private String city;
		private int telephonenumber;
		private String emailaddress;

		public String getFirstname() {
		    return firstname;
		}



		public void setFirstname(String firstname) {
		    this.firstname = firstname;
		}



		public String getLastname() {
		    return lastname;
		}



		public void setLastname(String lastname) {
		    this.lastname = lastname;
		}
		public int getStreetno() {
		    return streetno;
		}



		public void setStreetno(int streetno) {
		    this.streetno = streetno;
		}



		public String getStreet() {
		    return street;
		}



		public void setStreet(String street) {
		    this.street = street;
		}



		public String getCity() {
		    return city;
		}



		public void setCity(String city) {
		    this.city = city;
		}



		public int getTelephonenumber() {
		    return telephonenumber;
		}



		public void setTelephonenumber(int telephonenumber) {
		    this.telephonenumber = telephonenumber;
		}



		public String getEmailaddress() {
		    return emailaddress;
		}



		public void setEmailaddress(String emailaddress) {
		    this.emailaddress = emailaddress;
		}
		


		public AddressBookEntry() {
		    
		    setFirstname(f);
		    setLastname(l);
		    setStreetno(s);
		    setStreet(n);
		    setCity(c);
		    setTelephonenumber(t);
		    setEmailaddress(e);
		}




	public void print(){
			JOptionPane.showMessageDialog(null, "Firstname:"+ firstname +"Lastname:" + lastname + "Streetno:"+ streetno + "Street:"+ street
		    		+"City:"+ city +"Telephonenumber:"+ telephonenumber +"Emailaddress:"+ emailaddress);
		}
	
	
class PersonInfo{
	ArrayList<AddressBookEntry>persons;		
		
	public PersonInfo() {
  persons=new ArrayList<AddressBookEntry>();
	}
 
  
	}public void createContacts(ArrayList <String>persons)
	{
	    AddressBookEntry.address_bookentry.;
	    for (ArrayList <String> i: AddressBookEntry.address_book )
	    {
	        for (String j: i)
	        {
	            System.out.println(j);
	        }
	    }
	}
	
	public void addContact()
	{
	    ArrayList<String> persons= enterContactDetails();
	    createContacts(persons);
	}
	public ArrayList<String> enterContactDetails(ArrayList<String> persons)
	{
	    ArrayList <String> persons = new ArrayList<>();

	    System.out.println("Enter the first name: ");
	    Scanner sc1 = new Scanner(System.in);
	    String first_name = sc1.next();
	    persons.add(first_name);

	    System.out.println("Enter the last name: ");
	    Scanner sc2 = new Scanner(System.in);
	    String last_name = sc2.next();
	    persons.add(last_name);

	    System.out.println("Enter the address: ");
	    Scanner sc3 = new Scanner(System.in);
	    String address = sc3.next();
	    persons.add(address);

	    System.out.println("Enter the city name: ");
	    Scanner sc4 = new Scanner(System.in);
	    String city = sc4.next();
	    persons.add(city);

	    System.out.println("Enter the state's name: ");
	    Scanner sc5 = new Scanner(System.in);
	    String state = sc5.next();
	    persons.add(state);

	    System.out.println("Enter the zip: ");
	    Scanner sc6 = new Scanner(System.in);
	    String zip = sc6.next();
	    contact.add(zip);

	    System.out.println("Enter the phone number: ");
	    Scanner sc7 = new Scanner(System.in);
	    String phone_num = sc7.next();
	    persons.add(phone_num);

	    System.out.println("Enter the email ID: ");
	    Scanner sc8 = new Scanner(System.in);
	    String email = sc8.next();
	    contact.add(email);
	    return contact;
	}
	public int searchExistingContact(String search_pers)
	{
	    int index = -1;
	    int temp_index = -1;
	    for (ArrayList <String> i:AddressBookEntry.address_bookentry)
	    {
	        temp_index ++;
	        for (String j:i)
	        {
	            if (j.equals(search_pers))
	            {
	                index = temp_index;
	                break;
	            }
	        }
	    }
	    return index;
	}

	public void editExistingContact()
	{
	    System.out.println("Enter the name of the person whose details you " + "want to be changed");
	    Scanner sc = new Scanner(System.in);
	    String search_pers = sc.next();
	    int index = searchExistingContact(search_pers);
	    System.out.println("Found the name, Kindly enter new details ");
	    ArrayList<String> contact = enterContactDetails();
	    AddressBookEntry.address_bookentry.set(index, contact);
	}

	public void deleteExistingContact()
	{
	    System.out.println("Enter the name of the person whose details you "
	            + "want to be deleted");
	    Scanner sc = new Scanner(System.in);
	    String search_pers = sc.next();
	    int index = searchExistingContact(search_pers);
	    AddressBookEntry.address_bookentry.remove(index);
	}
	public void addPerson()
	{
	    System.out.println("Enter the person details");
	    addContact();
	}
	public static void main(String []args)
	{
	    System.out.println("Welcome to Address Book Program!");
	    AddressBookEntry edit  = new AddressBookEntry();
	    AddressBookEntry del  = new AddressBookEntry();
	    AddressBookEntry add  = new AddressBookEntry();
	    add.addPerson();
	    edit.editExistingContact();
	    del.deleteExistingContact();

	}

	}
	
 