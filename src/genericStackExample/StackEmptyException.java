/**
 * 
 */
package genericStackExample;

/**
 * @author Ryan Olsen
 *An exception for stack-empty errors
 */
public class StackEmptyException extends Exception{
	public String toString() {
		return "\nThe stack is empty";
		
	}//end method toString()
}//end class StackEmptyException
