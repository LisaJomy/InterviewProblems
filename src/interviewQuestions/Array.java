package interviewQuestions;
//old style of array

//main method main CRL+space+enter
public class Array {

	public static void main(String[] args) {
		
		//array can be declared as object
		int arr[]=new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		//array can be declared as literal
		
		int a []= {1,2,3,4,5,6,7};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//multidimensional array
		//passing objects both in x axis and y axis is called multidimentional array
		//rows and columns
		System.out.println("************");
		int b[] []= {{2,4,5},{3,4,7}};//[2][3]
		for(int i=0;i<2;i++) {
			
			
			for(int j=0;j<3;j++) {
				
				
				System.out.print(b[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
	

}
