/**
 * 
 */
package genericStackExample;

/**
 * @author Ryan Olsen
 * adds two generic constructors for use with the IFGenStack generic class
 * Includes methods to push objects to a stack and pop objects off of the stack
 */
public class GenStack <T> implements IFGenStack<T>{
	private T stck[]; //This array holds the stack
	private int tos; //top of the stack
	
	//Construct an empty stack given its size
	GenStack(T [] stckArray) {
		stck = stckArray;
		tos = 0;
	}//end constructor
	
	//Construct a stack from a stack
	GenStack(T [] stckArray, GenStack<T> ob) {
		tos = ob.tos; 
		stck = stckArray;
	
	try {
		if(stck.length < ob.stck.length)
			throw new StackFullException(stck.length);
		
	} catch (StackFullException exc) {
		System.out.println(exc);
	}//end catch
	
	//Copy Elements
	for(int i = 0; i < tos; i++)
		stck[i] = ob.stck[i];
	}
	
	//Construct a stack with initial values
	GenStack(T[] stckArray, T[] a) {
		stck = stckArray;
		
		for(int i = 0; i < a.length; i++) {
			try {
				push(a[i]);
			} catch (StackFullException exc) {
				System.out.println(exc);
			}//end catch
		}//end for loop
	}//end constructor 
	
	//Push objects onto the stack
	public void push(T obj) throws StackFullException {
		if(tos ==stck.length) throw new StackFullException(stck.length);
		
		stck[tos] = obj;
		tos++;
	}//end method push()
	
	//Pop an object from the stack
	public T pop() throws StackEmptyException {
		if(tos == 0)
			throw new StackEmptyException();
		
		tos--;
		return stck[tos];
		
	}//end method pop()
}//end class GenStack
