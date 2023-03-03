public static int [ ] fromInteger ( int L ) {
  int [ ] B = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) B [ i ] = Integer . parseInt ( input ( ) ) ;
  int t = 0 ;
  for ( int x : B ) {
    t ^= x ;
  }
  if ( t != 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  System . out . println ( t ) ;
  for ( int x = B . length - 1 ;
  x >= 0 ;
  x -- ) {
    t ^= B [ x ] ;
    System . out . println ( t ) ;
  }
  return B ;
}
