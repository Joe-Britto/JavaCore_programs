package examples;
enum Season2 {
	WINTER(5),SUMMER(10),FALL(18),SPRING(34);
	
	 int value;
	
	Season2(int value) {
		this.value = value;
	}
	}
	

public class EnumExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example of specifing intial value of enum constant");
		for(Season2 s:Season2.values()){
			System.out.println(s+" "+s.value);
		}

	}

}
