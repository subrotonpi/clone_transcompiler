public static void input ( ) {
  Scanner S = new Scanner ( System . in ) ;
  int [ ] c = new int [ 26 ] ;
  for ( int i = 0 ;
  i < c . length ;
  i ++ ) {
    c [ ( int ) S . charAt ( i ) - 97 ] ++ ;
  }
  int L = 0 ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    if ( c [ i ] % 2 == 1 ) {
      L ++ ;
      c [ i ] -= c [ i ] % 2 ;
    }
  }
  int M = Integer . parseInt ( c ) / 2 ;
  if ( Integer . parseInt ( c ) % 2 == 1 ) {
    System . out . println ( "Baka" ) ;
    exit ( ) ;
  }
  int T [ ] = 1 ;
  for ( int k = 0 ;
  k < M ;
  k ++ ) {
    T [ k % L ] += 2 ;
  }
  System . out . println ( min ( T ) ) ;
}
