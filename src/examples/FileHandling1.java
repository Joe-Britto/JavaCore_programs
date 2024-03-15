package examples;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 System.out.println("Creation of file");
	      
		 File objFile1 = new File("newFile.txt");
            
       if (objFile1.createNewFile())
    	   System.out.println("File created is :"+objFile1.getName());
       else
    	   System.out.println("File already created is :"+objFile1.getName());
       
       System.out.println("Writing single line of text in a file");
       
       FileOutputStream fos = new FileOutputStream(objFile1);
       DataOutputStream dos = new DataOutputStream(fos);
       dos.writeUTF("Hello World");
       System.out.println("One line of text written succesfuly");
       System.out.println();
       System.out.println("Writing multiple  line of text in a file");
       
       String ml[] = { "I'm Studying very hard",
    		           "Core Java programing",
    		           "Next i'ii be focusing on DSA in Java"
       };
       
          for (String str:ml)
        	  dos.writeUTF(str);
          System.out.println("Multiple  line of text written succesfuly");
          
          System.out.println("Appending text to end of a file ");
            dos.writeUTF("All the best !!!!");
            
            System.out.println("Reading first line of text in  a file");
            FileInputStream fis = new FileInputStream(objFile1);
            DataInputStream dis = new DataInputStream(fis);
            String oneLine = dis.readUTF(dis);  // reads just a single line of text
            System.out.println(oneLine);
            System.out.println("Reading multiple line of text in  a file");
            
            while(dis.available()>0) {   // available() returns 1 till end of line 
            String mLine = dis.readUTF(dis); // otherwise returns zero
            System.out.println(mLine);
            }
            
            System.out.println("Do not forget to close files .File Closed");
            dos.close();  // 
            dis.close();
	}

}
