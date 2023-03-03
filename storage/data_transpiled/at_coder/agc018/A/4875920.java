@ MoreRequires public static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  int M = Collections . max ( A ) ;
  /* while (b > 0) {
  a = b;
  b = a % b;
  }*/
  int m = A . size ( ) ;
  if ( K <= M && K % m == 0 ) {
    System . out . println ( "POSSIBLE" ) ;
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  return M ;
}
