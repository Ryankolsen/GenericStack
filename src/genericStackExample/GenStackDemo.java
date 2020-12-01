/**
 * 
 */
package genericStackExample;

/**
 * @author Ryan Olsen
 * Demo to use generic stack program. 
 * Two blank generic methods are used Interface IFGenStack
 * Class GenStack has two generic constructors
 * 
 * User is prompted to enter numbers. The numbers will be stored in an int array. This array is 
 * then stored in an integer type stack to demonstrate the last in first out functions of a stack.
 * Results are printed to the screen
 * 
 * This program also constructs a stack from a string array. It then constructs a stack from 
 * another stack and prints the result to the screen
 * 
 * Errors are handled by the StackEmptyException and StackFullException classes to prevent
 * the Array Out Of Bounds error from terminating the program
 */
public class GenStackDemo {

	public static void main(String[] args) {
		//Construct 10 element empty integer stack
		Integer iNums[] = new Integer[10];
		GenStack<Integer> stk1 = new GenStack<Integer>(iNums);
		
		//Construct stack from array:
		String name[] = {"First", "Second", "Third"};
		String strStore[] = new String[3];
		GenStack<String> stk2 = new GenStack<String>(strStore, name);
		
		String str;
		int[] userNumArray;
		int n;
		
		UserStackInput UserStack = new UserStackInput();
		userNumArray = UserStack.ReadInput();
		
		
		//transfer user values from the integer array to stack/number array stk1
		try {
			for(int i = 0; i < userNumArray.length; i++)
				stk1.push(userNumArray[i]);
		} catch (StackFullException exc) {
			System.out.println(exc);
		}//end catch
		
		//Construct stack from another stack
		String strStore2[] = new String[3];
		GenStack<String> stk3 = new GenStack<String> (strStore2, stk2);
		
		//show the stacks
	try {
			System.out.print("Contents of stk1: ");
			for(int i = 0; i < userNumArray.length; i++) {
				n = stk1.pop();
				System.out.print(n + " ");
			}
			System.out.println();
		
			System.out.println("\nContents of stk3: ");
			for(int i = 0; i < 3; i++) {
				str = stk3.pop();
				System.out.print(str + " ");
			}
			
		}catch (StackEmptyException exc) {
			System.out.println(exc);
		}
		System.out.println();

	}//end main

}//end class GenStackDemo
