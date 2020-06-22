package interviewQuestions;
// this is used to invoke current class constructor
public class ThisConstructor2 {

public ThisConstructor2() {
	System.out.println("This is default constructor");
		}


public ThisConstructor2(int i) {
	this();
	System.out.println("the value of i is  "+i);
	
}

public ThisConstructor2(int i,int j) {
	
	this(i);
	System.out.println("the value of i is  "+i+"  and the value of j is" +j);
	
}


	
	public static void main(String[] args) {
		
		ThisConstructor2 obj3=new ThisConstructor2(5,6);	
		
	}

}
