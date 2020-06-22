package interviewQuestions;

//1.this is used to initialize current class object


public class ThisConstuctor1 {
	int i;
	int j;
	int k;
	public ThisConstuctor1(int i, int j) {
	this.i=i;
	this.j=j;
	}
	
	public ThisConstuctor1(int i) {
		k=i;
	}

public static void main(String[] args) {

ThisConstuctor1 obj = new ThisConstuctor1(5,6);
System.out.println(obj.i);
System.out.println(obj.j);

ThisConstuctor1 obj1=new ThisConstuctor1(9);
System.out.println(obj1.k);

	}

}
