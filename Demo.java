import java.util.Scanner;

//
/*
Association (Has-A)
1.Aggregation--->Weak Relationship
2.Containment(Composition)-->Strong 
Eg.
Car--
MusicSystem
Engine
 			Inheritance						Containment/Aggregation
 	1.All Properties of Parents       1. Required Properties are inheried
 	  are inherited		
 	2.Is-A Relationship		          2.Has-A Relationship
 	3.extends keyword used		      3.We create Objects inside class as Instance
 	                                     variables
 	                                     class Car
 	                                     {
 	                                          MusicSystem m;
 	                                          Engine e=new Engine();
 	                                          ---
 	                                       }   
 	                                     
 			*/
public class Demo {
public static void main(String args[])
{//int streetNO, String city, String state, String country
	//String pName, String pJobName, String pJobLocation, 
	//int pAdhaarNo, int pJobId, Adress adr
	
	Adress a1=new Adress(1000,"Solapur","MH","India") ;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Person Name");
	//String name=sc.next();
	Person p1=new Person(sc.next(),"Java Trainer","Pune",1244567889,1001,a1);
	p1.displayPersonDetails();
	
	College c1=new College("Orchid Engg. college");
	c1.displayCollegeDetails();
	
	
	System.out.println(p1);//p1.toString()
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
