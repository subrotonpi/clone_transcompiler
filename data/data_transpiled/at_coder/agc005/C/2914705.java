@ VisibleForTesting static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . filter ( i -> i > n ) . toArray ( ) ;
  int [ ] c = Arrays . stream ( a ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  boolean ok = true ;
  int d_max = Collections . max ( Arrays . asList ( a ) ) ;
  if ( n > 2 && d_max == 1 ) {
    ok = false ;
  }
  if ( c [ d_max ] == 1 ) {
    ok = false ;
  }
  else {
    if ( d_max % 2 == 0 ) {
      int d_min = d_max / 2 ;
      if ( min ( a ) < d_min ) {
        ok = false ;
      }
      if ( c [ d_min ] != 1 ) {
        ok = false ;
      }
      for ( int d = d_min + 1 ;
      d < d_max ;
      d ++ ) {
        if ( c [ d ] < 2 ) {
          ok = false ;
        }
      }
    }
    else {
      int d_min = ( d_max + 1 ) / 2 ;
      if ( min ( a ) < d_min ) {
        ok = false ;
      }
      if ( c [ d_min ] != 2 ) {
        ok = false ;
      }
      for ( int d = d_min + 1 ;
      d < d_max ;
      d ++ ) {
        if ( c [ d ] < 2 ) {
          ok = false ;
        }
      }
    }
  }
  if ( ok ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
