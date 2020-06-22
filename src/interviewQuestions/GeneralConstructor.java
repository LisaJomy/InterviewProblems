package interviewQuestions;

public class GeneralConstructor {
	String name;
	int age;
	int salary;
	
	
public GeneralConstructor(String name, int age, int salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
void display() {
	System.out.println("the name is"+name+"The age is"+age+"The salary is"+salary);
}

	public static void main(String[] args) {
		
		GeneralConstructor obj = new GeneralConstructor("lisa",25,1000);//each object will have a copy of the variable and method
		obj.display();
		GeneralConstructor obj1 = new GeneralConstructor("Neena",26,6600);
		obj.display();
	}

}
