public static int N = Integer . parseInt ( input ) {
  int p = 1 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    p = ( p * i ) % 1000000007 ;
  }
  System . out . println ( p ) ;
  return p ;
}
