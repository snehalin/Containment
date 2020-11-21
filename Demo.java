//Inheritance--> It is is-A relationship between classes
//Association--> It is has-A relationship between classes
//1.Aggregation -- weak Car-MusicSystem   
//2.Composition/Containment--strong  Car-Engine
/*
class Car
{   int id;
    
   MusicSystem m1;
   or 
   MusicSystem m1=new MusicSystem();
	1.Engine e1; or
	2.Engine e1=new Engine();
	
}

class MusicSystem
{
}
class Engine
{
}


*/
public class Demo {
public static void main(String args[])
{//String PName, long pAdhaarNo, String pJobName, int pJobId, Address adr
	//int streetNo, String city, String state, String country
	//Address adr=new Address(12,"Solapur","MH","India");
	//Person p1=new Person("Snehali",1234567890,"TRainer",123,adr);
	Person p1=new Person("Snehali",1234567890,"TRainer",123,new Address(12,"Solapur","MH","India"));
	p1.displayPersonDetails();
	
	College c1=new College("MIT");
	c1.displayCollegeDetails();
	
	
}
}
