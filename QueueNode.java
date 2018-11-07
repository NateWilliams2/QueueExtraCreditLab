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
