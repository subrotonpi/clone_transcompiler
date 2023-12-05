static final int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) B [ i ] = i ;
  if ( k <= 10 * 5 ) {
    NOW = a ;
    for ( int j = 0 ;
    j < k ;
    j ++ ) NOW = B [ j ] ;
    System . out . println ( NOW ) ;
    System . exit ( 0 ) ;
  }
  int [ ] LIST = new int [ N + 1 ] ;
  LIST [ N ] = 0 ;
  NOW = a ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    LIST [ i ] ++ ;
  }
  NOW = a ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    LIST [ i ] = B [ i ] ;
  }
  return LIST ;
}
