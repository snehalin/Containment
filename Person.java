
public class Person {
	String PName;
	long PAdhaarNo;
	String PJobName;
	int PJobId;
	Address adr;
	
	public Person(String PName, long pAdhaarNo, String pJobName, int pJobId, Address adr) {
		//super();  Object
		this.PName = PName;
		PAdhaarNo = pAdhaarNo;
		PJobName = pJobName;
		PJobId = pJobId;
		this.adr = adr;
	}
	
	void displayPersonDetails()
	{
		System.out.println("Name="+PName+"Aadhar no="+PAdhaarNo+"Job Name="+PJobName
				+ "Job Id="+PJobId+"Country="+adr.country);
		
	}
	
}
