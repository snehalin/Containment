
public class College {
String CollegeName;
Address collegeadr=new Address(13,"Pune","MH","India");
 College(String collegeName) {
	super();
	CollegeName = collegeName;
}
void displayCollegeDetails()
{
	System.out.println("\nCollegeName="+CollegeName+"Street no"+collegeadr.streetNo
			+"City="+collegeadr.city);
}

}
