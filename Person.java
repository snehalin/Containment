/*Create class Person with the following:
i) Data Members:PName, PAdhaarNo.,PJobName,PJobId,PJobLocation
ii) Constructor with args to initialize the variables.
iii)Create Address object as a member of Person class.
iv)Create method displayPersonDetails() to display the details of person.
*/
public class Person {
String  PName,PJobName,pJobLocation;
int PAdhaarNo,pJobId;
Adress adr;
public Person(String pName, String pJobName, String pJobLocation, 
		int pAdhaarNo, int pJobId, Adress adr) {
	super();
	PName = pName;
	PJobName = pJobName;
	this.pJobLocation = pJobLocation;
	PAdhaarNo = pAdhaarNo;
	this.pJobId = pJobId;
	this.adr = adr;
}

 void displayPersonDetails()
 {
	System.out.println("PersonName:"+PName+"\n Job Name:"+PJobName+"\n Job Location:"
			+ pJobLocation+"Adress:city"+adr.city); 
 }

@Override
public String toString() {
	return "Person [PName=" + PName + ", PJobName=" + PJobName + ", pJobLocation=" + pJobLocation + ", PAdhaarNo="
			+ PAdhaarNo + ", pJobId=" + pJobId + ", adr=" + adr + "]";
}
 
 
 
 
 
 

}
