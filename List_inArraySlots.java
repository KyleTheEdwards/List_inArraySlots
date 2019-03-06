/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    public static int MAX_SIZE = 128;
    private int[] data;
    private int topOfArray = 0;
    private int arraySize;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
      data = new int[MAX_SIZE];
      arraySize = 0;
    }


    /**
      @return the number of elements in this list
     */
     public int size() {
       return arraySize;
     }


     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
     public String toString() {
       String retString = "[";
       for (int x = 0; x < arraySize; x++){
         retString += (Integer.toString(data[x]) + ",");
       }
       retString += "]";
       return retString;
     }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
       if(topOfArray >= MAX_SIZE){

         return false;
         
       } else {

         data[topOfArray] = value;
         topOfArray++;
         arraySize++;

         return true;
       }
     }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data
     */
     // private void expand() {
        // System.out.println( "expand... (for debugging)");
           // /* S.O.P. rules for debugging:
              // Working methods should be silent. But during
              // development, the programmer must verify that
              // this method is called when that is appropriate.
              // So test using the println(), then comment it out.
              // */
     // }
}
