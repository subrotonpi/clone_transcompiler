@ java . io . BufferedReader ( "d:\\incoming\\b-large.in" ) private static PrintStream inp = new PrintStream ( new java . io . FileReader ( "d:\\incoming\\b-large.in" ) ) {
  PrintStream outp = new PrintStream ( new java . io . FileWriter ( "b-large.out" ) ) ;
  private void nextPermutation ( List seq , Comparator pred ) {
    /* reverse seq to end */
    int start = seq . size ( ) ;
    int end = seq . size ( ) ;
    if ( end <= start ) return ;
    do {
      seq . set ( start , end ) ;
      if ( start == end || start + 1 == end ) return ;
      start ++ ;
      end -- ;
    }
    while ( start <= end ) ;
    if ( start == 0 ) return ;
    try {
      seq . get ( 0 ) ;
    }
    catch ( IndexOutOfBoundsException e ) {
      throw new IllegalArgumentException ( "seq must allow random access." ) ;
    }
    int first = 0 ;
    int last = seq . size ( ) ;
    int len = seq . size ( ) ;
    if ( last == 1 ) return new int [ 0 ] ;
    do {
      int next = last - 1 ;
      do {
        int next1 = next ;
        next -- ;
        if ( pred . compare ( seq . get ( next ) , seq . get ( next1 ) ) < 0 ) {
          int mid = last - 1 ;
          while ( ! ( pred . compare ( seq . get ( next ) , seq . get ( mid ) ) < 0 ) ) mid -- ;
          seq . set ( next , mid ) ;
          reverse ( seq , next1 , last ) ;
          return ;
        }
        if ( next == first ) return new int [ 0 ] ;
      }
      while ( next == last ) ;
    }
    catch ( IndexOutOfBoundsException e ) {
      throw new IllegalArgumentException ( "seq must allow random access." ) ;
    }
  }
  int cases = Integer . parseInt ( inp . readLine ( ) ) ;
  for ( int cc = xrange ( cases ) ;
  cc < cases ;
  cc ++ ) {
    List n = new ArrayList ( ) ;
    String m = new String ( nextPermutation ( n ) ) ;
    String ret ;
    if ( m . equals ( "" ) ) {
      Collections . sort ( n ) ;
      int lz = 0 ;
      while ( lz < n . size ( ) && n . get ( lz ) . equals ( "0" ) ) lz ++ ;
      ret = String . valueOf ( n . get ( lz