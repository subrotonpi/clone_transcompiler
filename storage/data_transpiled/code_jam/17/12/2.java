if ( 1 ) {
  @ SuppressWarnings ( "unchecked" ) List < Integer > x = ( List < Integer > ) x ;
  xr = xrange ;
  /* print args */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String [ ] vals = parts ( i ) ;
    assert vals . length == p ;
    for ( int j = 0 ;
    j < p ;
    j ++ ) {
      String b = bar ( ing [ i ] , vals [ j ] ) ;
      if ( b != null ) bars [ i ] . add ( b ) ;
    }
  }
  /* print "Case #" */
  if ( x . size ( ) == 1 ) {
    ans = bars [ 0 ] . size ( ) ;
  }
  else {
    int i = Math . min ( n , bars [ 0 ] . size ( ) ) ;
    int I = Math . max ( bars [ i ] . size ( ) , bars [ i ] . size ( ) ) ;
    if ( I != i ) bars [ i ] . add ( i ) ;
  }
  /* print "Case #" */
  if ( x . size ( ) == 1 ) {
    /* print "Case #" */
    if ( x . size ( ) == 1 ) {
      /* print "Case #" */
      bars [ i ] . add ( x ) ;
    }
    /* print "Case #" */
    if ( x . size ( ) != 1 ) bars [ i ] . add ( x ) ;
    /* print "Case #" */
    bars [ i ] . add ( x ) ;
  }
  /* print "Case #" */
  if ( x . size ( ) != 1 ) bars [ i ] . add ( x ) ;
  /* print "Case #" */
  if ( x . size ( ) != 1 ) bars [ i ] . add ( x ) ;
  /* print "Case #" */
  if ( x . size ( ) != 1 ) bars [ i ] . remove ( x ) ;
  /* print "Case #" */
  return x . size ( ) == 1 ? x : bars [ i ] . remove ( x ) ;
}
