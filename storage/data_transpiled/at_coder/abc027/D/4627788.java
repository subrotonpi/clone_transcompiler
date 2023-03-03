public static int [ ] S ( ) {
  int [ ] li = new int [ input . length ( ) ] ;
  int c = 0 ;
  for ( int i = S . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    if ( S . charAt ( i ) == 'M' ) li [ i ] ++ ;
  }
  return li ;
}
