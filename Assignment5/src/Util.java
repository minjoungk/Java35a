/*Min Joung Kim
*CIS 35A
*Assignment7
*DueDate: June 6,2016
*June 7,2016*/

import java.io.*;
import java.util.StringTokenizer;
public class Util {
	
private static boolean debug = true;


@SuppressWarnings("null")
static Student[] readFile(String filename, Student [] stu) {

	int row = 0;
	int colume =0;
	int [] data = new int[6];
	try{
		
		FileReader input = new FileReader(filename);
		BufferedReader bufferInput = new BufferedReader(input);
		String line;
		String stringPiece = " ";
		
		boolean eof = false;
		while(!eof){
			
			line = bufferInput.readLine();
			
			row++;
			
			if(line == null){
				
				eof = true;
			
			}else{
				
				if(debug){
					
					//System.out.println("Read: " + line);

				}
				
				if(row == 1){
					;
				}
				if(row > 1){

					
					int num;
					
					StringTokenizer st = new StringTokenizer (line);
					while(st.hasMoreTokens()){
						
						for(colume = 0; colume < 6; colume++){
							
							stringPiece = st.nextToken();
							
							num = Integer.parseInt(stringPiece);

							data[colume]=num;
						
						
							
					}
						
						}
						stu[row-2] = new Student(data);
						
					}

					
					
				}
			
			}
		
			
		bufferInput.close();
		}catch(IOException e){
			System.out.println("Error: " + e);
		}
		


return stu;	
	}

	
}
