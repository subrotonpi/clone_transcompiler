static final PriorityQueue < Integer > heapPriorityQueue = new PriorityQueue < Integer > ( ) {
  @ Override public int poll ( ) {
    for ( int test_case : xrange ( 1 , Integer . parseInt ( readLine ( ) ) ) ) {
      int N = Integer . parseInt ( readLine ( ) ) ;
      int [ ] D = new int [ N + 1 ] ;
      int [ ] L = new int [ N + 1 ] ;
      for ( int i : xrange ( N ) ) {
        D [ i ] = Integer . parseInt ( readLine ( ) ) ;
        L [ i ] = Integer . parseInt ( readLine ( ) ) ;
      }
      D [ N ] = Integer . parseInt ( readLine ( ) ) ;
      int [ ] earliest = new int [ N + 1 ] ;
      Arrays . fill ( earliest , - 1 ) ;
      earliest [ 0 ] = 0 ;
      Heap < Integer > heap = new Heap < Integer > ( ) ;
      heapPriorityQueue . add ( heap , new Integer ( D [ 0 ] ) , D [ 0 ] + min ( D [ 0 ] - earliest [ 0 ] , L [ 0 ] ) ) ;
      for ( int i : xrange ( 1 , N + 1 ) ) {
        while ( heap . size ( ) > 0 && heap . get ( 0 ) . intValue ( ) < D [ i ] ) heap . poll ( ) ;
        if ( heap . size ( ) > 0 ) {
          earliest [ i ] = heap . get ( 0 ) . intValue ( ) ;
          heapPriorityQueue . add ( heap , new Integer ( D [ i ] ) , D [ i ] + min ( D [ i ] - earliest [ i ] , L [ i ] ) ) ;
        }
      }
      System . out . println ( "Case #" + test_case + ": " + ( earliest [ N ] != - 1 ? "YES" : "NO" ) ) ;
    }
    return N ;
  }
}
