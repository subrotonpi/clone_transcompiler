public static void input ( ) {
  int [ ] c = new int [ 26 ] ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    c [ ( int ) i ] = 0 ;
  }
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    c [ ( int ) i ] = c [ i ] - 97 ;
  }
  int L = 0 ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    if ( c [ i ] % 2 == 1 ) {
      L ++ ;
      c [ i ] -= c [ i ] ;
    }
  }
  int M = sum ( c ) / 2 ;
  int T [ ] = 1 ;
  for ( int k = 0 ;
  k < M ;
  k ++ ) {
    T [ k % L ] += 2 ;
  }
  System . out . println ( min ( T ) ) ;
}
