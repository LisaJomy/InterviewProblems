package interviewQuestions;

public class ThisConstructor3 {
	//This is also used to invoke current class method
	
	public void test1() {
		System.out.println("This is my first method");
	}
	
	

	public void test2() {
		this.test1();//------
		System.out.println("This is my second method");
	}
	
	
	public static void main(String[] args) {
		ThisConstructor3 obj= new ThisConstructor3();
		
		obj.test2();
	}

}
