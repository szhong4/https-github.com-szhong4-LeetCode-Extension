// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> peekItr;
    Integer peek;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    peekItr = iterator;
	    if (peekItr.hasNext()) {
	        peek = peekItr.next();
	    }
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return peek;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int temp = peek;
	    if (peekItr.hasNext()) {
	        peek = peekItr.next();
	    } else {
	        peek = null;
	    }
	    return temp;
	}

	@Override
	public boolean hasNext() {
	    return peek != null;
	}
}