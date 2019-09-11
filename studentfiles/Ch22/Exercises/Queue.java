public interface Queue
{
  /**
   * Returns true if this queue is empty; otherwise returns false.
   */
  boolean isEmpty();

  /**
   * Adds obj at the rear of this queue; returns true if successful.
   */
  boolean add(Object obj);

  /**
   * Removes and returns the object at the front of this queue.
   * Throws NoSuchElementException if the queue is empty.
   */
  Object remove();

  /**
   * Returns (but does not remove) the object at the front of this queue
   * or null if the queue is empty.
   */
  Object peek();
}
