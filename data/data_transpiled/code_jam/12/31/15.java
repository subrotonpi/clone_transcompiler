static final Operator < Integer > BFS = new Operator < Integer > ( ) {
  private static final int [ ] node = new int [ ] {
    1 }
    ;
    private boolean bfs ( int i ) {
      boolean res = false ;
      BitSet visited = new BitSet ( N + 1 ) ;
      Queue < Integer > q = new LinkedList < > ( ) ;
      q . add ( node [ i ] ) ;
      while ( q . size ( ) > 0 ) {
        Integer n = q . poll ( ) ;
        if ( visited . get ( n . intValue ( ) ) ) {
          res = true ;
          return res ;
        }
        else {
          visited . set ( n . intValue ( ) ) ;
        }
        for ( int x = 1 ;
        x < n ;
        x ++ ) {
          q . add ( node [ x ] ) ;
        }
      }
    }
  }
  