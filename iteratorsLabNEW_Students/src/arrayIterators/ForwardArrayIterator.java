package arrayIterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardArrayIterator<E> implements Iterator<E> {

	private E[] arr;    // the array to iterate over
	private int current;
	// other internal fields...
	
	public ForwardArrayIterator(E[] arr) { 
		this.arr = arr;
		current=0;
		// initialize other internal fields as needed
	}
	
	public boolean hasNext() {
		if(current < arr.length)
			return true;  
		return false;
		
	}

	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new 
				NoSuchElementException("No more elements to iterate over."); 
		E n =arr[current];
		current++;
		// rewrite
		return n;
	}

	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException(
				"Remove peration not implemented.");
		// do not implement
	}
}
