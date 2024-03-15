package examples;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;



public class DateTime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           LocalDate ld =  LocalDate.now();  // now() is a static method 
           System.out.println("Local date is : "+ld);
          
           LocalDate ld2 =  LocalDate.of(2023,12,30);// of() is a static method 
           System.out.println("User set date is : "+ld2);
           
           LocalDate ld3 =  LocalDate.of(2023,Month.AUGUST,30);// of() is a static method 
           System.out.println("User set date is : "+ld3);
           
           
           Instant instd = Instant.now();
           System.out.println("System Date & GMT Time  : "+instd);
           
           System.out.println();
           
           LocalTime lt = LocalTime.now();
           System.out.println("Local Time is : "+lt);
           LocalTime lt2 =  LocalTime.of(11, 35);// of() is a static method 
           System.out.println("User set Local Time  is : "+lt2);
           
           LocalDateTime ld4 =  LocalDateTime.now();// of() is a static method 
           System.out.println("Local Date & Time is : "+ld4);
           
       	}

}
