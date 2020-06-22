package interviewQuestions;

public class NumberfoundinList {

	
	

		    public static void main(String[] args) {
		        int[] num = {1, 2, 3, 4, 5};
		        int toFind = 4;
		        boolean found = false;
           // scan the entire loop for the number if present raise the flag found = true
		        
		       // if the number is not present why to check the array of numbers
		        for (int i=0;i<num.length;i++) {
		            if (num[i] == toFind) {
		            	
	            		found = true;
		            	break;
		            	}
		        	}
		        
		        //if found can get the value true or false
		        if(found) {
		        	System.out.println("The number is found");
		        }else {
		        	System.out.println("The number is not found");
		        }
	

}
}