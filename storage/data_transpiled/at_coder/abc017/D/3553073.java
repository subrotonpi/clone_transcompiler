@ VisibleForTesting static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int Mod = 10 * 9 + 7 ;
  @ SuppressWarnings ( "unchecked" ) int [ ] F = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) F [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ N ] ;
  boolean [ ] used = new boolean [ M + 1 ] ;
  int j = - 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    do {
      if ( j == N - 1 ) break ;
      j ++ ;
      if ( used [ F [ j ] ] ) {
        j -- ;
        break ;
      }
      used [ F [ j ] ] = true ;
    }
    l [ i ] = j - i + 1 ;
    used [ F [ i ] ] = false ;
  }
  Collections . reverse ( l ) ;
  int [ ] dp = new int [ N ] ;
  int [ ] cdp = new int [ N + 1 ] ;
  dp [ 0 ] = 1 ;
  cdp [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( i - 1 - l [ i ] < - 1 ) dp [ i ] = cdp [ i - 1 ] + 1 ;
    else dp [ i ] = cdp [ i - 1 ] - cdp [ i - l [ i ] - 1 ] ;
    cdp [ i ] = cdp [ i - 1 ] + dp [ i ] ;
    dp [ i ] %= Mod ;
    cdp [ i ] %= Mod ;
  }
  System . out . println ( dp [ N - 1 ] ) ;
}
