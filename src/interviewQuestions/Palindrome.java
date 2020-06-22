package interviewQuestions;

public class Palindrome {

	public static void main(String[] args) {
String	str ="malayalam";
String rev="";

//for(int i=str.length()-1;i>=0;i--) 
//	rev=rev + str.charAt(i);

//while loop

int i =str.length()-1;
while(i>=0) {
	rev=rev + str.charAt(i);
	i--;
}

	

System.out.println(rev);

if(str.equals(rev)) 
	System.out.println(str+" is a palindrome");
else
	System.out.println(str+" is not a palindrome");	

	}

}
