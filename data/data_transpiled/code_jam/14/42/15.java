static int solve ( int n , int [ ] s ) {
  final int cnt = 0 ;
  while ( n > 0 ) {
    int m = 0 ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      if ( s [ i ] < s [ m ] ) {
        m = i ;
      }
    }
    cnt += Math . min ( m , n - 1 - m ) ;
    n = n - 1 ;
    -- n ;
  }
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int test_case = 1 ;
  test_case <= t ;
  test_case ++ ) {
    final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int [ ] s = Arrays . stream ( s ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    System . out . println ( String . format ( "Case #%d: %d" , test_case , solve ( n , s ) ) ) ;
  }
  return cnt ;
}
