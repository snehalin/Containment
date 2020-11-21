/*
 Write a program to illustrate the concept of containment:
a) Create a class Address with the following:
i) Data Members: streetNo.,city, state, country.
ii) Constructor with arguments to initialize the variables.
b) Create class Person with the following:
i) Data Members:PName, PAdhaarNo.,PJobName,PJobId,PJobLocation
ii) Constructor with args to initialize the variables. iii)Create Address object as a member of Person class.
iv)Create method displayPersonDetails() to display the details of person.
c) Create a class college
i) Data Members: collegeName,Address collegeAddress.
ii) Constructor with arguments to initialize the variables
iii) Create method displayCollegeDetails() to display the details of college
 */
public class Address {
	int streetNo;
	String city, state, country;
	public Address(int streetNo, String city, String state, String country) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	
}
