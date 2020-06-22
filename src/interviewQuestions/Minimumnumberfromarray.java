package interviewQuestions;

public class Minimumnumberfromarray {
	// minimum number from the array
	
	
	public static void main(String[] args) {
		
		
		int b [] []= {{3,4,5},{3,4,7},{1,2,6}};
		int min=b[0][0];
		int max=b[0][0];
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++){
				if(b[i][j]>max) {//3
					max=b[i][j];//4
				}
			}


			
			
		}System.out.println("the maximum number in the array is "+max);
		
		
		


		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++){
				if(b[i][j]<min) {//3
					min=b[i][j];//4
				}
			}


			
			
		}System.out.println("The minimum number in the array is "+min);
		
		
		
		
		
		
		
		
	}

}
