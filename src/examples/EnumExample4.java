package examples;

enum Day{
      SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;	
}
public class EnumExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example of applying Enum on a switch statement");
	
		Day day = Day.MONDAY;
		
		switch(day) {
		case SUNDAY:
			System.out.println("sunday");
			break;
			
		case MONDAY:
			System.out.println("monday");
			break;
			
		case FRIDAY:
			System.out.println("friday");
			break;
			
		}

	}

}
