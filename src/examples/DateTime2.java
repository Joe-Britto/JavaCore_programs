package examples;
import java.time.*;
import java.time.LocalDateTime;

public class DateTime2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To get Zone code of all the countries;");
		
//		for(String val : ZoneId.getAvailableZoneIds()) {
//			System.out.println(val);
//		}
       
		LocalDateTime allcount = LocalDateTime.now(ZoneId.of("Australia/Melbourne"));
		System.out.println(allcount);
		
		LocalDate alldt = LocalDate.now(ZoneId.of("Australia/Melbourne"));
		System.out.println("Australia/Melbourne date:"+alldt);
		
		LocalTime allctime = LocalTime.now(ZoneId.of("Australia/Melbourne"));
		System.out.println("Australia/Melbourne Time:"+allctime);
		
		System.out.println("Methods in LocalDate and LocalTime");
		
		System.out.println(alldt.getYear());
		System.out.println(alldt.getMonthValue());
		
	}

}
