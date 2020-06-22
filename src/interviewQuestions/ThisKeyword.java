package interviewQuestions;

public class ThisKeyword {
	int a = 3;
	
	
	public ThisKeyword() {
		int a=10;
		
		
	}
	public void getData() {
		int a=10;
	System.out.println(a);	
	int b= a+this.a;
	System.out.println(b);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		ThisKeyword obj= new ThisKeyword();
        obj.getData();
	}

}
