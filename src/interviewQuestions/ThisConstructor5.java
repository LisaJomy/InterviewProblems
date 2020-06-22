package interviewQuestions;
// two programms ThisConstructor5, ThisConstructor6
//This passed as an argument in constructor call
public class ThisConstructor5 {
	int i;
	
	
	ThisConstructor5(ThisConstructor6 obj){
	this.i=obj.i;
	System.out.println(i);	
	}
	
	//void display() {
//		System.out.println("the value of i is" +i);
//	}
	
	
	

	
}
