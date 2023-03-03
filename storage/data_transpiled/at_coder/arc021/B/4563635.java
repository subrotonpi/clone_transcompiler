static final int [ ] getLengths ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] A = new int [ L ] ;
  for ( int i = 1 ;
  i < L ;
  i ++ ) {
    A [ i ] = A [ i - 1 ] ^ B [ i - 1 ] ;
  }
  if ( B [ B . length - 1 ] ^ A [ A . length - 1 ] ) {
    System . out . println ( - 1 ) ;
  }
  else {
    for ( int a : A ) {
      System . out . println ( a ) ;
    }
  }
  return A ;
}
