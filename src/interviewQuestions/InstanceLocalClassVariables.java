package interviewQuestions;

public class InstanceLocalClassVariables {
	
	String name;
	String address;  // instance variable// Why it is called instance variable because they are tied up to the object
	//String city;    // instance variable have different copy
	// static variable a copy shared by all the objects
	//static variables belong to class since static variables belong to the class they are also known as class variables
	static String city;
	static int i;//every object gets a seperate copy
	// Static variables only share one copy throughout
	// static the previous value will be retained
	
	// Static block*******************
	
	static {
		i=0;
		city="Banglore";
	}
	
	
public	 InstanceLocalClassVariables(String name,String address) {
		 this.name=name; // local variable to instance variables
		 this.address= address;// this refers to current class instance variable
		 i++;   //i=i+1
		 
		 System.out.println(i);
		
	}
	// to print out the values we have to create a method
	 
	 public void getAddress() {
		 //return address; //return address alone
		// to print all values the values 
		// System.out.println("the name is " +name+"  "+"the address is "+address);
		System.out.println(address+ "   "+ city); 
		 
	 }
	 
	 // static method accepts only static variables
//	 public static void getCity() {
//		 System.out.println(city);
//	 }
	
	
	// Each object will have a copy of variables and methods
// activate the value to variables from objects
	public static void main(String[] args) {
		InstanceLocalClassVariables	 i= new InstanceLocalClassVariables("Lisa","Marthali");
		InstanceLocalClassVariables	 i1= new InstanceLocalClassVariables("neena","rosewood");
      //System.out.println(i.name+" "+ i.address+" "+i.city);
		i.getAddress();
		i1.getAddress();
		//InstanceLocalClassVariables.getCity();
		System.out.println(InstanceLocalClassVariables.city);
		InstanceLocalClassVariables.i=4;
		
		
	}

}
