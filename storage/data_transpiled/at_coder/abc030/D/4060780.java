static final int [ ] getB ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , a = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ N * 2 ] ;
  for ( int i = 0 ;
  i < N * 2 ;
  i ++ ) {
    B [ i ] = i ;
  }
  int [ ] LIST = new int [ N * 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    LIST [ i ] = a ;
    a = B [ a - 1 ] ;
  }
  if ( k < N ) {
    System . out . println ( ) ;
  }
  return LIST ;
}
