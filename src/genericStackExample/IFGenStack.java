/**
 * 
 */
package genericStackExample;

/**
 * @author Ryan Olsen
 * A Generic Stack. This Interface includes two blank, generic methods
 */
public interface IFGenStack<T> {
	void push(T obj) throws StackFullException;
	
	T pop() throws StackEmptyException;
	}
