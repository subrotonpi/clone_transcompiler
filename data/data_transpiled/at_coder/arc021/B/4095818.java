public static void main ( String input ) {
  int L = Integer . parseInt ( input ) ;
  int [ ] inputs = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) inputs [ i ] = Integer . parseInt ( input ) ;
  int [ ] ans = new int [ L ] ;
  ans [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < L - 1 ;
  i ++ ) ans [ i ] = ans [ ans . length - 1 ] ^ inputs [ i ] ;
  if ( ans [ 0 ] ^ ans [ ans . length - 1 ] == inputs [ inputs . length - 1 ] ) System . out . println ( Arrays . toString ( ans ) ) ;
  else System . out . println ( - 1 ) ;
}
