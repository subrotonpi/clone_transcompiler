@ VisibleForTesting static int from ( int input ) {
  final int N = Integer . parseInt ( input ) ;
  for ( int i = 2 ;
  i <= ( int ) Math . sqrt ( N ) ;
  i ++ ) {
    if ( N % i == 0 ) {
      System . out . println ( "NO" ) ;
      System . exit ( 0 ) ;
    }
  }
  System . out . println ( "YES" ) ;
  return N ;
}
