package interviewQuestions;

public class MaxfromMincolumn {
// find the maximum from minmum column
	// find the maximum number in identified column
	
	
	//1) first find the number which is minimum then identify its column number
	public static void main(String[] args) {
	int mincolumn=0;
	int a[] []= {{2,4,5},{3,2,10},{1,2,0}};
	
	int min=a[0][0];
	for(int i=0;i<3;i++) {
		
		
		for(int j=0;j<3;j++) {
			if(a[i][j]<min) {
				min=a[i][j];
				
				mincolumn=j;//mincolumn is 2 with 0
			}
			
		}
	
	}//
	
	int k=0;
	int max=a[0][mincolumn];//(0,2)val=max 
		
	while(k<3) {
		if(a[k][mincolumn]>max) {
			
			max=a[k][mincolumn];
	}
	k++	;
		
		
	
		
	}System.out.println(max);

}
}