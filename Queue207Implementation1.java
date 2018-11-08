/*****************************************************************
     * Nate Williams & Milica Cvrkota                                *
     * PO Box 4580 (nate)                                            *
     * Program for CSC 207                                           *
     *   Queue207Implementation1.java                                              *
     * For Queue Implementation lab (extra credit) due November 19)  *
     *****************************************************************/


    /* ***************************************************************
     * Academic honesty certification:                               *
     *   Written/online sources used:                                *
     *     Singly-Linked Lists lab and supporting material           *
     *   Help obtained                                               *
     *     none                                                      *
     *   My signature below confirms that the above list of sources  *
     *   is complete AND that I have not talked to anyone else       *
     *   [e.g., CSC 161 students] about the solution to this problem *
     *                                                               *
     *   Signature:                                                  *
     *****************************************************************/
package queues;

import java.util.NoSuchElementException;

/** class for queue implementation */
public class Queue207Implementation1 <E> implements Queue207<E> {
	/** number of items in queue*/
	int numberItems;

	/** pointer to first element of queue*/
	QueueNode head;

	/** pointer to last element of queue*/
	QueueNode tail;

	/** default constructor */
	Queue207Implementation1 () {
		numberItems = 0;
		head = null;
		tail = null;
	}

	/**
	 * method to add nodes to queue
	 * @param e the element to add
	 * @return true if the element is added
	 * throws IllegalStateException if element is not added correctly
	 */
	public boolean add(E e) {
		try {
			if (head == null) { //if queue is empty, set head and tail to new element
				head = new QueueNode();
				head.setData(e);
				head.setNext(null);
				tail = head;
			} else { //if queue is non-empty, set new element at the tail
				QueueNode newNode = new QueueNode(e, null);
				tail.setNext(newNode);
				tail = tail.getNext();
			}
			return true;
		} catch (IllegalStateException exception) {
			System.err.println(exception);
			return false;
		}
	}

	/**
	 * removes and retrieves head element of queue
	 * @return E data stored in the head of the queue
	 * Throws NoSuchElementException if queue is empty
	 */
	public E remove() throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException();
		} else {
			E temp = (E) head.getData();
			head = head.getNext();
			return temp;
		}
	}

	/**
	 * retrieves but does not remove head element of queue
	 * @return E data stored in the head of the queue
	 * Throws NoSuchElementException if queue is empty
	 */
	public E element() throws NoSuchElementException {
		if (head == null) {
			throw new NoSuchElementException();
		} else {
			return (E) head.getData();
		}
	}

	/**
	 * returns size of queue
	 * @return size
	 */
	 public int size () {
	        int num = 0;
	        QueueNode ptr = head;
	        while (ptr != null) {
	            num++;
	            ptr = ptr.getNext();
	        }
	        return num;
	    }


	  /**
	   * prints nicely formatted list of elements in queue
	   */
	    public void print () {
	        System.out.println ("The integer values in the list nodes are");
	        QueueNode ptr = head;
	        while (ptr != null) {
	            System.out.println ("     " + ptr.getData());
	            ptr = ptr.getNext();
	        }
	    }



	public static void main(String[] args) {

		Queue207Implementation1 <Integer> queue1 = new Queue207Implementation1 ();//int queue
		Queue207Implementation1 <String> queue2 = new Queue207Implementation1 ();//String queue

//		QueueNode n1= new QueueNode ();
//		QueueNode n2= new QueueNode ();

		/* uncomment the following line for exception testing peeking at the empty list: should
		 * throw a NoSuchElementException */

		//System.out.println ("Peeking at first element in empty queue1: " + queue1.element());

		queue1.add(1);
		queue1.add(11);
		queue1.add(827);
		queue1.add(56);
		queue1.add(87);

		queue2.add("a");
		queue2.add("b");
		queue2.add("g");
		queue2.add("fg");
		queue2.add("fs");

		queue1.print();
		queue2.print();

		System.out.println ("Number of elements in the queue 1: " + queue1.size());
		System.out.println ("Number of elements in the queue 2: " + queue2.size());

		System.out.println ("Peeking at first element in queue1: " + queue1.element());

		System.out.println ("Removing first element from queue1: " + queue1.remove());
		System.out.println ("Removing second element from queue1: " + queue1.remove());

		System.out.println ("Number of elements in the queue 1 after removing 2 elements: " + queue1.size());
		queue1.print();

		// testing for removal of all elements and of empty queue, should return exception when queue is empty
		for (int i = 1; i < 100; i++) {
			System.out.println ("Removing element " + i + " from queue1: " + queue1.remove());
		}
	}
}
