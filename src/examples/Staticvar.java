package examples;

class Stu{
	String name;
	int rollno;
	static String col = "RJS";// static instance variable
	
		Stu(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	void display() {
		System.out.println("Studens name: "+name+","+" Studens rollNo."+rollno+","+" College: "+col);
	}
}
public class Staticvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static Variables, method and class refer 'javatpoint.com'");
		
		Stu stt1 = new Stu("Joe",101);
		Stu stt2 = new Stu("Brit",102);
		stt1.display();
		stt2.display();
		

	}

}
