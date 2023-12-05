static final PriorityQueue < Pair < Integer , Integer >> heapPriorityQueue = new PriorityQueue < Pair < Integer , Integer >> ( ) {
  private static final long serialVersionUID = 1L ;
  @ Override public int poll ( ) {
    return Integer . parseInt ( input . readLine ( ) ) ;
  }
}
