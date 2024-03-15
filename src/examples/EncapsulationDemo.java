package examples;

class EncapTrial{
	private int age = 22;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Age set to " + age);
	} 
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binding of Data variables and methods in a class ");
		System.out.println("is called Encapuslation. We use getters() and Setters()");
		System.out.println("to achieve Encapsulation.variables in a claas are called");
		System.out.println("instance variables");
		EncapTrial Obj3 = new EncapTrial();
		Obj3.setAge(50);
		System.out.println(Obj3.getAge());
	}

}
