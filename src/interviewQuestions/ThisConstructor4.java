package interviewQuestions;
//this can be passed as argument in method call
public class ThisConstructor4 {
	public void test1(ThisConstructor4 obj) {
		System.out.println("test1");
		System.out.println(obj);
	}
public void test2() {
	
	
// different ways to write
	//this.test1(this);
	
	//test1(this);
	ThisConstructor4 obj=new ThisConstructor4();
	this.test1(obj);
}

	public static void main(String[] args) {
		
		
	ThisConstructor4 obj=new ThisConstructor4();
		obj.test2();
	}

}
