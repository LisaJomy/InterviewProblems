package interviewQuestions;
//String
public class StringRahulshetty {

	public static void main(String[] args) {
		// Two ways we declare a String
		
		//creating literals /String a= "hello"
		//creating an object   / String a= new String();
		
		
		String a="  hello hello  ";
		System.out.println(a.charAt(2));
		
		System.out.println(a.indexOf("e"));
		
		System.out.println(a.substring(0));//one length less
		
		System.out.println(a.length());
		System.out.println(a.concat("javaTraining"));
		
		System.out.println(a.trim());
		String b="hello hello";
		
String arr[]=b.split(" ");
System.out.println("***");
System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(b.replace(" ","t"));




//for(int i=0;i<a.length();i++) {
//	System.out.println(arr[i]);
//}

for(int i=0;i<10;i=i+2) {
	if(i==6) {
		System.out.println("6 is displayed");
	}else
	{
		System.out.println("6 is not displayed");
	}
}




	}

}
