public static int K = Integer . parseInt ( input ) {
  if ( K == 1 ) {
    System . out . println ( 1 ) ;
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  int m = - ( ( - K ) / 4 ) ;
  int n = 2 * m ;
  int [ ] [ ] a = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] [ 0 ] = 0 ;
  }
  for ( int r = 0 ;
  r < n ;
  r ++ ) {
    for ( int c = 0 ;
    c < n ;
    c ++ ) {
      int p = - 1 ;
      if ( r % 2 == 0 ) p = ( r + c ) % n ;
      else p = n + ( r + c ) % n ;
      if ( p >= K ) p -= n ;
      a [ r ] [ c ] = p ;
    }
  }
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sb . append ( String . valueOf ( a [ i ] [ j ] + 1 ) ) ;
  }
  System . out . println ( n ) ;
  for ( int line : sb ) {
    System . out . println ( sb . toString ( ) ) ;
  }
  return 0 ;
}
