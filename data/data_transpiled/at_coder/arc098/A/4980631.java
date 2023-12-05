public static void print ( int N ) {
  char [ ] S = Scanner . getChars ( ) ;
  int [ ] w = new int [ N ] ;
  int [ ] e = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    w [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    w [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S [ i ] == 'W' ) {
      w [ i ] = w [ i - 1 ] + 1 ;
      e [ i + 1 ] = e [ i ] ;
    }
    else {
      w [ i ] = w [ i - 1 ] ;
      e [ i + 1 ] = e [ i ] - 1 ;
    }
  }
  int ans = w [ 0 ] + e [ 0 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    w [ i ] = w [ i ] + e [ i ] ;
    if ( ans > w [ i ] ) {
      ans = w [ i ] ;
    }
  }
  System . out . println ( ans + scale - 1 ) ;
}
