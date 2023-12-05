public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t : xrange ( 1 , T + 1 ) ) {
    String line = in . nextLine ( ) ;
    List < Integer > ints = CollectionUtils . newArrayList ( ) ;
    for ( int i = 0 ;
    i < line . length ( ) ;
    i ++ ) {
      ints . add ( Integer . parseInt ( line . substring ( i , i + 1 ) ) ) ;
    }
    int N = ints . remove ( 0 ) ;
    int S = ints . remove ( 0 ) ;
    int p = ints . remove ( 0 ) ;
    int c = 0 ;
    for ( int i = 0 ;
    i < ints . size ( ) ;
    i ++ ) {
      int lo , hi ;
      int r = ints . get ( i ) % 3 ;
      switch ( r ) {
        case 0 : lo = i / 3 ;
        hi = lo + 1 ;
        break ;
        case 1 : lo = hi = ( i + 2 ) / 3 ;
        break ;
        case 2 : lo = ( i + 1 ) / 3 ;
        hi = lo + 1 ;
        break ;
      }
    }
    if ( lo >= p ) {
      c ++ ;
    }
    else if ( hi >= p ) {
      if ( S > 0 ) {
        c ++ ;
        S -- ;
      }
    }
  }
  System . out . println ( "Case #" + t + ": " + c ) ;
  return c ;
}
