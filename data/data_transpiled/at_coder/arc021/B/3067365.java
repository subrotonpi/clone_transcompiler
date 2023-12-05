public static void print ( String s ) {
  int L = Integer . parseInt ( s ) ;
  int [ ] B = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( s ) ;
  }
  int [ ] A = new int [ L ] ;
  A [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < L ;
  i ++ ) {
    A [ i ] = B [ i - 1 ] ^ A [ i - 1 ] ;
  }
  if ( A [ 0 ] ^ A [ L - 1 ] != B [ L - 1 ] ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( Arrays . toString ( A ) ) ;
  }
}
