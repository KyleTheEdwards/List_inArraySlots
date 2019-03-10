/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    public int MAX_SIZE = 10;//mostly chosen for demonstration purposes
    private int[] data;
    private int arraySize;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
      data = new int[MAX_SIZE];
      arraySize = 0;
    }

    //take input intArray and clone contents into our version of a list
    public List_inArraySlots(int[] input) {
      int length = input.length;
      data = new int[length];
      for(int i = 0; i < length; i++){
        data[i] = input[i];
      }
      arraySize = length;
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

      if(arraySize >= MAX_SIZE){
        expand();
      }

      data[arraySize] = value;
      arraySize++;

      return true;
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data
     */              // Working methods should be silent. But during

    private void expand() {
      System.out.println( "expand... (for debugging)");
         // /* S.O.P. rules for debugging:
            // Working methods should be silent. But during
            // development, the programmer must verify that
            // this method is called when that is appropriate.
            // So test using the println(), then comment it out.
            // */

      MAX_SIZE *= 2;
      int[] newData = new int[MAX_SIZE];

      for(int x = 0; x < arraySize; x++){
        newData[x] = data[x];
      }

      data = newData;

    }

         /**
      accessor
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether user violated the condition.)
     */
    public int get( int index ) {
      return data[index];
    }


    /**
      Set value at @index to @newValue

      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
    public int set( int index, int newValue ) {
      int oldData = data[index];
      data[index] = newValue;
      return oldData;
    }


    /**
      Insert @value at position @index in this list.

      Shift the element currently at that position (if any)
      and any subsequent elements to the right
      (that is, increase the index associated with each).
     */
    public void add( int index, int value) {

      if(arraySize == MAX_SIZE){
        expand();
      }

      for(int elemIndex = arraySize; elemIndex > index; elemIndex--){
        data[elemIndex] = data[elemIndex - 1];
      }

      data[index] = value;
      arraySize++;
    }


    /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    public int remove( int index) {
      int removedVal = data[index];

      for( int elemIndex = index; elemIndex < (arraySize - 1); elemIndex++){
        data[elemIndex] = data[elemIndex + 1];
      }

      arraySize--;

      return removedVal;

    }
}
