package interviewQuestions;


//this passed as argument in constructor call
public class ThisConstructor6 {
int i=90;


ThisConstructor6(){
	ThisConstructor5 obj= new ThisConstructor5(this) ;// this refers to current class object where i = 90;
	//obj.display();
}


public static void main(String[] args) {
	ThisConstructor6 obj = new ThisConstructor6();
	

}
}
