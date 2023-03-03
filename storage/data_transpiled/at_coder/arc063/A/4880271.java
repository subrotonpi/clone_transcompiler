public static void input ( ) {
  int count = 0 ;
  char prev = S [ 0 ] ;
  for ( int i = 1 ;
  i < S . length ;
  i ++ ) {
    if ( S [ i ] != prev ) {
      count ++ ;
      prev = S [ i ] ;
    }
  }
  System . out . println ( count ) ;
}
