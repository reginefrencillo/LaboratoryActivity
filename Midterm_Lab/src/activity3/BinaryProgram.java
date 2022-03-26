/******************************************************************
 * Program 1: Conversion from binary to decimal representation
 * Programmer: Regine L. Frencillo
 *             Janelle Coprado Lesano
 * 
 * Class: IT 121        Instructor: John Mark Grabentina
 *        
 * Pledge: I have neither given nor received unauthorized aid
 * on this program.     (signature on file)
 *
 * Description: This program converts a binary number to decimal.
 *
 * Input: Binary number
 *
 * Output: Decimal number
 *
 ******************************************************************/

package activity3;

import javax.swing.*;

public class BinaryProgram {

	public static void main(String[] args) {
	     String binaryString=JOptionPane.showInputDialog("Enter a 6-bit binary number");
	      
	     int binary=Integer.parseInt(binaryString);
	      
	     int decimal=0;
	
	     int bit;
	  

	int i=0;
	int power2=1;
	int len=binaryString.length();
	while (i<len) {
	    bit=binary%10;
	    decimal=decimal+bit*power2;
	    binary=binary/10;
	    power2*=2;
	    i++;
	}

	     String binaryOutput="Binary: " + binaryString;
	     String decimalOutput="Decimal: " + decimal;

	     JOptionPane.showMessageDialog(null, binaryOutput + "\n" + decimalOutput,
	        "Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);
	  
	     System.exit(0);
	          
	  
	}

	

}
