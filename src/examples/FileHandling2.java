package examples;
import java.io.*;

public class FileHandling2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      File f2 = new File("File2.txt");
      
      if (f2.createNewFile()) 
   	   System.out.println("File created is :"+f2.getName());
      else
   	   System.out.println("File already created is :"+f2.getName());
		
	  System.out.println("Writing multiple  line of text in a file");
	  FileOutputStream fos2 = new FileOutputStream(f2);
       DataOutputStream dos2 = new DataOutputStream(fos2);
	
       String ml2[] = { "I'm Studying very hard",
	           "Core Java programing",
	           "Next i'ii be focusing on DSA in Java"
               };

               for (String str:ml2)
	              dos2.writeUTF(str);
                System.out.println("Multiple  line of text written succesfuly");
                
                System.out.println("Reading multiple  line of text in  a file");
                FileInputStream fis2 = new FileInputStream(f2);
                DataInputStream dis2 = new DataInputStream(fis2);
                
                while(dis2.available()>0) {   // available() returns 1 till end of line 
                    String mLine2 = dis2.readUTF(dis2); // otherwise returns zero
                    System.out.println(mLine2);
                    }
                
                System.out.println("Deletion of a file \n"
                		+ "Before that we need check whether file exists");
                
                if (f2.exists()) {
                	System.out.println("File name is :" +f2.getName());
                	System.out.println("File path is :" +f2.getAbsolutePath());
                	System.out.println("Read ? :" +f2.canRead());
                	System.out.println("Write ? :" +f2.canWrite());
                	System.out.println("File size :" +f2.length());
                	System.out.println("f2.delete();-used this for deleting a file"); 
                }
                
                else {
                	System.out.println("File does not exists");
                }
	}	
}
