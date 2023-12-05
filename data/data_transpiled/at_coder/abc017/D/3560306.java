public static int [ ] getM ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , m = Integer . parseInt ( input . readLine ( ) ) ;
  long mod = 1000000007 ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] dp = new int [ n + 1 ] ;
  dp [ 0 ] = 1 ;
  int [ ] b = new int [ n ] ;
  int migi = 0 ;
  int hida = 1 ;
  HashSet < Integer > yo = new HashSet < Integer > ( ) ;
  while ( migi < n ) {
    yo . add ( a [ migi ] ) ;
    try {
      b [ hida ] = migi ;
    }
    catch ( Exception e ) {
    }
    if ( hida == migi ) hida ++ ;
    if ( hida < n && ( a < n ) && ! yo . contains ( a [ hida ] ) ) {
      yo . add ( a [ hida ] ) ;
      b [ hida ] = migi ++ ;
    }
    else {
      yo . remove ( a [ migi ] ) ;
      migi ++ ;
    }
  }
  int [ ] c = new int [ n ] ;
  sum = 1 ;
  hida = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = hida ;
    j < b [ i - 1 ] ;
    j ++ ) SUM += ( mod - dp [ j ] % mod ) ;
    hida = b [ i - 1 ] ;
    dp [ i ] += SUM % mod ;
    SUM += dp [ i ] ;
    SUM %= mod ;
  }
  System . out . println ( dp [ n - 1 ] % mod ) ;
  return c ;
}
