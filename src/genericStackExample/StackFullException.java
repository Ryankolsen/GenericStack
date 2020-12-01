/**
 * 
 */
package genericStackExample;

/**
 * @author Ryan Olsen
 * An exceptoin for stack full errors
 */
public class StackFullException extends Exception {
	int size;
	
	StackFullException(int s) { size = s;}
	
	public String toString() {
		return "\nThe stack is full. Maximum size is " + size;
		
	}//end method toString()
}//end class StackFullException
