//Create a class Address with the following:
//i) Data Members: streetNo.,city, state, country.
//ii) Constructor with arguments to initialize the variables.
public class Adress {
 int streetNO;
 String city,state,country;
public Adress(int streetNO, String city, String state, String country) {
	super();//Object
	this.streetNO = streetNO;
	this.city = city;
	this.state = state;
	this.country = country;
}
@Override
public String toString() {
	return "\nAdress streetNO=" + streetNO + ", city=" + city + ", state=" + state + ", country=" + country ;
}
 
	
	
}
