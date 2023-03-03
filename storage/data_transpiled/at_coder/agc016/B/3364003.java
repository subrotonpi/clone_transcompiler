public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  int K = Collections . max ( A ) ;
  int L = Collections . min ( A ) ;
  if ( K == L ) {
    if ( K == N - 1 || 2 * K <= N ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else if ( Math . abs ( K - L ) == 1 ) {
    int x = K * N - Integer . parseInt ( A ) ;
    if ( 2 * K - x <= N && x < K ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    System . out . println ( "No" ) ;
  }
}
