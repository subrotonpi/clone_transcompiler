static final private java . util . List < String > TYPE = new java . util . ArrayList < String > ( ) {
  {
    add ( "d" ) ;
    add ( "l" ) ;
    add ( "f" ) ;
    add ( "s" ) ;
  }
  private final java . util . List < String > _buffer = new java . util . ArrayList < String > ( ) ;
  {
    if ( _buffer . isEmpty ( ) ) {
      String line = System . console ( ) . readLine ( ) ;
      _buffer . addAll ( line . split ( " " ) ) ;
    }
  }
  {
    int i , j ;
    if ( F [ 0 ] [ V ] == null ) {
      return "IMPOSSIBLE" ;
    }
    else {
      return F [ 0 ] [ V ] ;
    }
  }
  int num_cases = scanf ( "%d" ) ;
  for ( int k = xrange ( M ) ;
  k < num_cases ;
  k ++ ) {
    int result = solve ( ) ;
    printf ( "Case #%d: %s\n" , ( M - 1 ) , i + 1 , result ) ;
  }
  for ( int k = xrange ( M ) ;
  k < num_cases ;
  k ++ ) {
    int i = 2 * k + 1 ;
    int j = 2 * k + 2 ;
    if ( G [ k ] . get ( ) . equals ( "d" ) ) {
      F [ k ] [ 0 ] = min2 ( F [ i ] [ 0 ] , F [ j ] [ 0 ] ) ;
      F [ k ] [ 1 ] = add2 ( F [ i ] [ 1 ] , F [ j ] [ 1 ] ) ;
      if ( C [ k ] . get ( ) . equals ( "%" ) ) {
        throw new IllegalArgumentException ( ) ;
      }
      if ( ! "dfs" . equals ( C [ k ] . get ( ) . toString ( ) ) ) {
        throw new IllegalArgumentException ( ) ;
      }
    }
    List < String > result = new ArrayList < String > ( ) ;
    for ( int i = xrange ( M ) ;
    i < num_cases ;
    i ++ ) {
      String token = getNextToken ( ) ;
      String value = TYPE . get ( C [ i ] . toString ( ) ) . apply ( token ) ;
      result . add ( value ) ;
    }
    return result ;
  }
}
