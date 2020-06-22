package interviewQuestions;

public class StringConcactination {

	public static void main(String[] args) {
		//jAVA 02 SESSION COMPLETE
		
		String  s="Test";
		String y= "Doger";
		
		int a = 100;
		int b = 200;
		
		double d1= 12.33;
		double d2= 14.99;
		System.out.println(s+y);
		System.out.println(a+b);System.out.println(d1+d2);
		System.out.println(a+d1);
		System.out.println(s+a);
		//exceptional case
		System.out.println(s+y+a+b);
	
		//TestDoger100200
		System.out.println(s+y+(a+b));
		//TestDoger300
		
		System.out.println();
		
		//as soon as it sees the string the others remain as a string
		//-----------------------------
		System.out.println(a+b+s+y+d1+d2);
		//300TestDoger12.3314.33
		System.out.println("the sum of a and b is:" +a+b);
		//the sum of a and b is: 100200
		System.out.println("the sum of a and b is:"+(a+b));
		
		//the sum of a and b is : 300
		//-----------------------------
		char c1 = 'a';
		char c2='b';
		
		//the answer will be assci value = 195
		
		//a-z==97  122
		//A-Z==65 90		
		//0-9==48 57
		
		
		//incremental operator and decrementaL OPERATOR
		
		
		
		
		int i = 1;  // *******pre increment*****
		int j=++i;// increase and give the value to i then assign that value to j;
		
		
		System.out.println(i);//2
		System.out.println(j);//2
		
		
		int p=1;
		int q=p++;//post increrment
	System.out.println(p);//2
	System.out.println(q);//1
	
	
	int m = 1;
	int n =--m;
	System.out.println(m);//0
	System.out.println(n);//0

	
		int c = 0;
		int d = c--;
		System.out.println(c);//-1
		System.out.println(d);//0
		
	// don't assign the value for static vriables it will  assign default value
		
		//example the default 
		
		//default value of character is  SPACE
		
		//0/3=0
		//9/0==ARITHMATIC EXCEPTION
		
		
		
		
		

	}

}
