/**
//***********************************************************************
'Project: Assignment 04
'Programmer: Tyler Spring
'Company Info:  tgspring@mylearning.csmd.edu  
'Date: 3 04 2017
'Description:  Problem Number 01.  
'    
'   Rain fall program.
'   Passes and copies new array.
'   Finds total, average, highest, lowest.
'
'	--------------------------------------------------------------------------
'   							HONOR CODE: 
'	I pledge that this program represents my own program code, I have received 
'	help from no one and I have given help to no one.
'	
'								OR
'
'	I received help from NO ONE in designing and debugging my program.
'	I given help to NO ONE in designing and debugging my program.
'-----------------------------------------------------------------------------
'
'  LINE LENGTH - AVOID LINES LONGER THAN 80 CHARACTERS
'  SCALE BELOW IS TO CALIBRATE SCREENSHOTS
'  DO NOT HAVE YOUR CODE OR SCREENSHOT EXTEND BEYOND THE SCALE
0........1.........2.........3.........4.........5.........6.........7.........8
12345678901234567890123456789012345678901234567890123456789012345678901234567890
*/
public class TGS_P01 {

	public static void main(String[] args) {
		
		
		double[] thisYearsRainfall = {1.66, 82.10, 211.70, 3.50, 
				132.60, 3.70, 73.90, 52.60, 102.90, 4.30, 2.40, 63.70};
		
		System.out.printf("MONTH\t\tRAIN\n");
		Rainfall r = new Rainfall(thisYearsRainfall);	
		System.out.printf("\n" + r);
			
	}
}
