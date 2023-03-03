private static int worst ( int n , int i ) {
  if ( n == 0 ) {
    return 0 ;
  }
  else {
    if ( i == 0 ) return 0 ;
    else {
      return 2 * ( n - 1 ) + worst ( n - 1 , ( i - 1 ) / 2 ) ;
    }
  }
  /* answer # */
  int l = - 1 , r = 2 * N - 1 ;
  while ( l != r ) {
    int m = ( l + r ) >>> 1 ;
    if ( worst ( N , m + 1 ) < P ) {
      l = m + 1 ;
    }
    else {
      r = m ;
    }
  }
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int caseNr = 1 ;
  caseNr <= T ;
  caseNr ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int P = Integer . parseInt ( readLine ( ) ) ;
    int ans1 = answer ( N , P ) ;
    int ans2 = answer ( N , 2 * N - P ) ;
    System . out . println ( "Case #" + caseNr + ": " + ans1 + " " + ( 2 * N - ans2 - 2 ) ) ;
  }
  return N ;
}
