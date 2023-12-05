public static void input ( ) {
  int cc = 0 ;
  for ( int i = 0 ;
  i < S . length - 1 ;
  i ++ ) {
    if ( S [ i ] != S [ i + 1 ] ) {
      cc ++ ;
    }
  }
  System . out . println ( cc ) ;
}
