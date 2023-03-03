@ VisibleForTesting static void solve ( ) {
  final int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  final int c = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  final int m = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  final int [ ] p = new int [ m ] ;
  final int [ ] b = new int [ m ] ;
  final Map < Integer , Integer > users = new HashMap < > ( ) ;
  final Map < Integer , Integer > poses = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    b [ i ] = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    users . put ( b [ i ] , 1 ) ;
    poses . put ( p [ i ] , 1 ) ;
  }
  int ans = Collections . max ( users . values ( ) ) ;
  int s = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    s += poses . get ( i ) ;
    ans = Math . max ( ans , ( s + i - 1 ) / ( i ) ) ;
  }
  int promo = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    if ( poses . get ( i ) > ans ) promo += poses . get ( i ) - ans ;
  }
  System . out . println ( ans + " " + promo ) ;
  if ( Class . isEnum ( ) ) {
    final int T = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    for ( int caseIdx : xrange ( 1 , T + 1 ) ) {
      System . out . print ( "Case #" + caseIdx + ": " ) ;
      solve ( ) ;
    }
  }
}
