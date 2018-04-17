package llPositionalList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.Position;
import interfaces.PositionalList;

public class PositionalListElementBackwardIterator<E> implements Iterator<E>{
	PositionalList<E> list; 
	Position<E> current, recent; 
	public PositionalListElementBackwardIterator(PositionalList<E> list) { 
		this.list = list; 
		current = list.first(); 
		recent = null; 
	}
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public E next() throws NoSuchElementException {
		if (!hasNext()) 
			throw new NoSuchElementException("No more elements to iterate over."); 
		recent = current; 
		current = list.after(current); 
		return recent.getElement();
	}

	public void remove() throws IllegalStateException { 
		if (recent == null)
			throw new IllegalStateException("Invalid state to apply remove."); 
		list.remove(recent); 
		recent = null; 
	}

}
