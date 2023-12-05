public static int input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( ! N [ i ] . equals ( "1" ) ) {
      System . out . println ( N [ i ] ) ;
      break ;
    }
    else {
      res ++ ;
    }
  }
  if ( res == K ) {
    System . out . println ( 1 ) ;
  }
  return res ;
}
