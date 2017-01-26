/*Min Joung Kim
*CIS 35A
*Assignment7
*DueDate: June 6,2016
*June 7,2016*/

public class GradeBookAPI extends GradeBookFormat implements Myconstant, InstructorInterface, StudentInterface{
	
	private static Student stu[]= new Student[15];
	private static Statistics staty =new Statistics();
	
	
	
	public void LoadandComputeData(String fname){
		
		
		stu= Util.readFile(fname,stu);
		
		
		
		
		staty.findlow(stu);
		staty.findhigh(stu);
		staty.findavg(stu);
		
	}
	public void CheckStudentScore(int sid){
		System.out.println("\n\nScores of the following Student ID(" + sid + "):");
		System.out.println("Stud Qu1 Qu2 Qu3 Qu4 Qu5");
		
		for(int i = 0; i < stu.length; i++){
			
			if(stu[i].getSID() == sid){
				stu[i].printData();
			}
			 
		 }
		System.out.println("----------------------------------------");
		System.out.println("\n\nStatistic of Student scores:");
		staty.printhigh();
		staty.printlow();
		staty.printavg();
		
		if(DEBUG){
		System.out.println("----------------------------------------");
		System.out.println("Student Scores:");
		
		System.out.println("Stud Qu1 Qu2 Qu3 Qu4 Qu5");
		for(int i = 0; i < stu.length; i++){
			
			stu[i].printData();
			 
		 }
		
		}
		
		
		
	}
}
