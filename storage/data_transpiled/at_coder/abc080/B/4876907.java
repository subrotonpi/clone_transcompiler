public static int N ( ) {
  int T = Integer . parseInt ( N ) ;
  N = Integer . parseInt ( N ) ;
  if ( T % N == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return T ;
}
