static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
  /* IntList */
  IntList getIntList = new IntList ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    getIntList . add ( Integer . parseInt ( s ) ) ;
  }
  /* zeros */
  int [ ] [ ] ta = new int [ n ] [ ] ;
  /* db */
  if ( debug ) System . out . println ( input ) ;
  debug = false ;
  int N = getInt ( ) ;
  ta = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ta [ i ] = getIntList . get ( ) ;
  }
  db ( ta ) ;
  int [ ] real = ta [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( real [ 0 ] / TA [ i ] [ 0 ] > real [ 1 ] / TA [ i ] [ 1 ] ) {
      int lc = ( real [ 0 ] + TA [ i ] [ 0 ] - 1 ) / TA [ i ] [ 0 ] * TA [ i ] [ 0 ] ;
      real [ 0 ] = lc ;
      real [ 1 ] = lc * TA [ i ] [ 0 ] / TA [ i ] [ 1 ] ;
    }
    db ( new Integer ( lc ) ) ;
  }
  System . out . println ( Arrays . toString ( real ) ) ;
}
