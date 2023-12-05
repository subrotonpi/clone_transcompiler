public static void print ( int N ) {
  int [ ] p = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( i + 1 == p [ i ] ) {
      p [ i + 1 ] = p [ i ] ;
      ans ++ ;
    }
  }
  System . out . println ( p [ N - 1 ] != N ? ans : ans + 1 ) ;
}
