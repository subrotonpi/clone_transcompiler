static final int [ ] getHigherRange ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > s = new HashSet < > ( ) ;
  int [ ] q = {
    0 , 0 }
    ;
    for ( int a : map . values ( ) ) {
      if ( a > q [ 0 ] ) {
        try {
          s . remove ( a ) ;
          heapify ( q , a ) ;
        }
        catch ( Exception e ) {
        }
      }
    }
    return q ;
  }
  