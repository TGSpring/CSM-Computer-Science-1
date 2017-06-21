/**
//***********************************************************************
'Project: Assignment 04
'Programmer: Tyler Spring
'Company Info:  tgspring@mylearning.csmd.edu  
'Date: 1 04 2017
'Description:  Problem Number 02.  
'    
'   Charge account program
'   Asks user to enter number
'   Tests whether the number is valid.
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
import javax.swing.*;

public class TGS_P02 
{
	public static void main(String[] args) 
	{
		String input;
		int accountNumber;
		
		Validator val = new Validator();
		
		input = JOptionPane.showInputDialog
				("Enter your charge account number: ");
		accountNumber = Integer.parseInt(input);
		
		if (val.isValid(accountNumber))
			JOptionPane.showMessageDialog
			(null, "That's a valid account number.");
		else
			JOptionPane.showMessageDialog
			(null, "That's an INVALID account number.");
		System.exit(0);
	}
}
