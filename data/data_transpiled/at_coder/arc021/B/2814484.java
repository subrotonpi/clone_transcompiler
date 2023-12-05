public static void print ( int L ) {
  int [ ] B = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ L ] ;
  ans [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < L - 1 ;
  i ++ ) ans [ i ] = ans [ L - 1 ] ^ B [ i ] ;
  if ( ans [ L - 1 ] != B [ B - 1 ] ) System . out . println ( - 1 ) ;
  else System . out . println ( ( int ) ans [ L - 1 ] ) ;
}
