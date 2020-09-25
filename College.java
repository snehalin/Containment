/*Create a class college
i) Data Members: collegeName,Address collegeAddress.
ii) Constructor with arguments to initialize the variables
iii) Create method displayCollegeDetails() to display the details of college*/
public class College {

	String collegeName;
	//int streetNO, String city, String state, String country)
	Adress collegeAddress=new Adress(109,"Satara","MH","India");
	public College(String collegeName) {
		//super();
		this.collegeName = collegeName;
	}
	
	void displayCollegeDetails()
	{
		System.out.println("College Name="+collegeName+"College Adress="+
	collegeAddress.streetNO+","+collegeAddress.city+","+collegeAddress.state);
	}
	
}
