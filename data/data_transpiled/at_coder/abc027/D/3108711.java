public static int [ ] input ( ) {
  int p = 0 ;
  int [ ] m = new int [ s . length ( ) ] ;
  for ( int i = s . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    m [ i ] *= - 1 ;
  }
  return m ;
}
