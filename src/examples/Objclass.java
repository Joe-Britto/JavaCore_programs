package examples;

class Student {
	String name;
	int rank;
	
	void display()
	{
		System.out.println("Name :" +name);
		System.out.println("Rank :" +rank);
	}
}

public class Objclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.name = "Joe";
		s1.rank = 1;
		s1.display();
		s2.name = "Brit";
		s2.rank = 1;
		s2.display();

	}

}
