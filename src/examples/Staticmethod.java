package examples;

class Stud{
	String name;
	int rollno;
	static String col = "RJS";// static instance variable
	
		Stud(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}
		
		static void colname() {  // static method now col "RJS"is replaced with "RBANMS"
			col = "RBANMS";
		}
		
	void display() {
		System.out.println("Studens name: "+name+","+" Studens rollNo."+rollno+","+" College: "+col);
	}
}
public class Staticmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static Variables, method and class refer 'javatpoint.com'");
		
		Stud stt1 = new Stud("Joe",101);
		Stud stt2 = new Stud("Brit",102);
		Stud.colname();  // calling static method
		stt1.display();
		stt2.display();
		

	}

}
