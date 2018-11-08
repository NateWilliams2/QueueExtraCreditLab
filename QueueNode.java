/*****************************************************************
     * Nate Williams & Milica Cvrkota                                *
     * PO Box 4580 (nate)                                            *
     * Program for CSC 207                                           *
     *   QueueNode.java                                              *
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

public class QueueNode <E>
{
   /**
    * Each QueueNode has a data field of type E
    * and a next field to support a singly-linked list
    */
   private E data;
   private QueueNode next;

   /**
    * The default construtor sets the data and next fields to null
    */
   public QueueNode ()
   {
      data = null;
      next = null;
   }

   /**
    * An alternative constructor has both data and next parameters
    */
   public QueueNode (E origData, QueueNode origNext)
   {
      data = origData;
      next = origNext;
   }

   /**
    * Get method for data
    * @return data
    */
protected E getData() {
	return data;
}

	/**
	 * Set method for data
	 * @param data
	 */
protected void setData(E data) {
	this.data = data;
}

	/**
	 * Get method for next
	 * @return next
	 */
protected QueueNode getNext() {
	return next;
}

	/**
	 * Set method for next
	 * @param next
	 */
protected void setNext(QueueNode next) {
	this.next = next;
}



}
