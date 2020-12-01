/**
 * 
 */
package genericStackExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Ryan Olsen
 * Class to ask user for input to create an array of integers
 */
public class UserStackInput {
	
	int size;				//Holds the size of the array
	int [] userNumbers1;	//The array to return at the end of the method ReadInput()
	
	//Method to prompt user and return the user's array
	int [] ReadInput() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter up to ten numbers. I will store them in stack stk1");
			String lines = br.readLine();
			
			String[] strs = lines.trim().split("\\s+");
			
			size = strs.length;
			int  userNumbers []  = new int [size];
			for(int i = 0; i < strs.length; i++) {
				userNumbers[i] = Integer.parseInt(strs[i]);
				userNumbers1 = userNumbers;
				
			}
			return userNumbers;
		} catch (IOException e) {
		System.out.println("Error " + e);
		}
		return userNumbers1;
		}//end method ReadInput()
}//end class UserStackInput
