public static int [ ] solve ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) A [ i ] = 0 ;
  for ( int i = 0 ;
  i < L - 1 ;
  i ++ ) A [ i + 1 ] = A [ i ] ^ B [ i ] ;
  if ( B [ B . length - 1 ] == A [ 0 ] ^ A [ A . length - 1 ] ) {
    for ( int i = 0 ;
    i < L ;
    i ++ ) System . out . println ( A [ i ] ) ;
  }
  else System . out . println ( - 1 ) ;
  return A ;
}
