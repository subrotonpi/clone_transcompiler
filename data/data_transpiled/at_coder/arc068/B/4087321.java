public static void print ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Arrays . sort ( A ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( A [ i ] == A [ i ] ) {
      res ++ ;
    }
  }
  res = ( N - res + 1 ) / 2 * 2 - 1 ;
  System . out . println ( res ) ;
}
