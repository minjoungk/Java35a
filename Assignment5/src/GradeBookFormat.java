/*Min Joung Kim
*CIS 35A
*Assignment7
*DueDate: June 6,2016
*June 7,2016*/
import java.io.*;

public abstract class GradeBookFormat {
	
	
	private static Student stu[];
	private static Statistics staty;
	
	public abstract void LoadandComputeData(String fname);
	public abstract void CheckStudentScore(int sid);
}




