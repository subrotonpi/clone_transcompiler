public static int N = Integer . parseInt ( input ) {
  HashMap < Integer , Integer > pdic = new HashMap < > ( 2 ) ;
  for ( int i = 3 ;
  i <= 50 ;
  i += 2 ) {
    for ( int j = 0 ;
    j < pdic . size ( ) ;
    j ++ ) {
      if ( i % j == 0 ) {
        break ;
      }
    }
    else {
      pdic . put ( i , 0 ) ;
    }
  }
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    for ( int p = 0 ;
    p < pdic . size ( ) ;
    p ++ ) {
      while ( i % p == 0 ) {
        pdic . put ( p , 1 ) ;
        i /= p ;
      }
    }
  }
  int [ ] ge = new int [ pdic . size ( ) ] ;
  for ( int i = 3 ;
  i <= 5 ;
  i ++ ) {
    ge [ i ] = pdic . values ( ) . stream ( ) . filter ( x -> x >= i - 1 ) . filter ( x -> x >= i ) . filter ( x -> x > 3 ) . filter ( x -> x >= i - 1 ) . filter ( x -> x > 3 ) . filter ( x -> x >= i ) . filter ( x -> x > 3 ) . filter ( x -> x >= i - 1 ) . filter ( x -> x > 3 ) . filter ( x -> x > 5 ) . filter ( x -> x > 3 ) . filter ( x -> x > 3 ) . filter ( x -> x > 3 ) . filter ( x -> x > 3 ) . filter ( x -> x > 5 ) . filter ( x -> x > 3 ) . filter ( x -> x > 3 ) . filter ( x -> x > 3 ) . filter ( x > 3 ) . filter ( x -> x > 3 ) . filter ( x > 5 ) . filter ( x -> x > 3 ) . filter ( x > 3 ) . filter ( x > 3 ) . filter ( x > 3 ) . filter ( x > 3 ) . filter ( x > 4 ) . filter ( x > 5 ) . filter ( x > 3 ) . filter ( x > 4 ) . filter ( x > 5 ) . filter ( x > 3 ) . filter ( x > 4 ) . filter ( x > 5 ) . filter ( x > 4 ) . filter ( x > 5 ) . filter ( x > 4 ) . filter ( x > 4