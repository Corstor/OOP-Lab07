package it.unibo.oop.lab.nesting2;

import java.util.List;



/**
 * Represents the class of an acceptable list
 *
 * @param <T>
 * 				The type of elements in the acceptable list
 */
public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> list;
	
	/**
	 * Build a new {@link OneListAcceptable}
	 * 
	 * @param list
	 * 				the list to be accepted
	 */
	public OneListAcceptable(List<T> list) {
		super();
		this.list = list;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			
			private int current = 0;
			
			/**
			 * {@inheritDoc}
			 */
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if (newElement != null && newElement.equals(list.get(current))) {
					this.current++;
				} else {
					throw new ElementNotAcceptedException(newElement);
				}
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void end() throws EndNotAcceptedException {
				if (list.size() != current - 1) {
					throw new EndNotAcceptedException();
				}
			}
			
		};
	}
}
