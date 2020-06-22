package interviewQuestions;
// this is used to return the current class object
public class ThisConstructor7 {
	
	
	public ThisConstructor7 test1() {
		// can write in both ways same meaning
		return this;
		//return new ThisConstructor7();
	}

	public static void main(String[] args) {
		ThisConstructor7 obj=new ThisConstructor7();

	}

}
