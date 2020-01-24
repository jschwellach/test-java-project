package de.schwellach.examples;


/*
 * Non Thread-Safe Class in Java
 */
public class Counter {
  
    private int count;
  
    /*
     * This method is not thread-safe because ++ is not an atomic operation
     */
    public int getCount() {
      // this should be flagged
        return count++;
    }
}
