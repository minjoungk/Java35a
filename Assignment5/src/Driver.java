/*Min Joung Kim
*CIS 35A
*Assignment7
*DueDate: June 6,2016
*June 7,2016*/
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.*;
import java.lang.StringBuilder;
public class Driver {
	
    public static void main(String [] args) {
    	InstructorInterface a1=new GradeBookAPI();
		a1.LoadandComputeData("C:\\Users\\MinJoung\\Desktop\\CIS\\java\\Assignment5\\src\\Data.txt");
		a1.CheckStudentScore(5678);

		StudentInterface a12 = new GradeBookAPI();
		a12.CheckStudentScore(1224);
		
		StudentInterface a13 = new GradeBookAPI();
		a13.CheckStudentScore(6134);
    	
    	/*
    			Student lab2 [] = new Student[15];
    			String datas[] = new String[15];

    			lab2 = Util.readFile("C:\\Users\\MinJoung\\Desktop\\CIS\\java\\Assignment5\\src\\Data.txt", lab2);

    			//print out the Student ID and quiz scores.
    			
    			System.out.println("Stud Qu1 Qu2 Qu3 Qu4 Qu5");
    			for(int i = 0; i < lab2.length; i++){
					
    				lab2[i].printData();
					 
				 }
    			System.out.println();
    			Statistics stat = new Statistics();
    			
    			
    			stat.findlow(lab2);
    			stat.findhigh(lab2);
    			stat.findavg(lab2);
    			
    			
    			stat.printhigh();
    			stat.printlow();
    			stat.printavg();
    			try{
    				
    				SerializableFile s;
    				
    				s = new SerializableFile(lab2);
    					
    				//ObjectOutputStream
    				FileOutputStream fileout = new FileOutputStream("object.ser");
    				ObjectOutputStream oos = new ObjectOutputStream(fileout);
    				oos.writeObject(s);
    				
    				//ObjectInputStream
    				FileInputStream filein = new FileInputStream("object.ser");
    				ObjectInputStream ois = new ObjectInputStream(filein);
    				SerializableFile  sReplica = (SerializableFile)ois.readObject();
    				//print out from Serialized file
    				System.out.println();
    				System.out.println("Qu1 Qu2 Qu3 Qu4 Qu5");
    				sReplica.printscores();
    				sReplica.printhigh();
    				sReplica.printlow();
    				sReplica.printavg();
    				
    				
    				}catch(Exception e){
    					System.out.println("Error: " + e);
*/    				}
    			}

				
 


