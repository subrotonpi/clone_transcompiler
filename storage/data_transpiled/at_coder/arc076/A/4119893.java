public static void FactMod ( ) {
  {
    int [ ] f = new int [ n + 1 ] ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      f [ i ] = f [ i - 1 ] * i % mod ;
    }
    int [ ] inv = new int [ n + 1 ] ;
    inv [ 0 ] = Math . pow ( f [ f . length - 1 ] , mod - 2 , mod ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      inv [ i ] = inv [ i - 1 ] * i % mod ;
    }
    inv [ inv . length - 1 ] = 0 ;
  }
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int mod = 10 * 9 + 7 ;
  int ans = 0 ;
  FactMod F = new FactMod ( Math . max ( N , M ) , mod ) ;
  if ( Math . abs ( N - M ) == 1 ) {
    ans = F . fact ( N ) * F . fact ( M ) % mod ;
  }
  else if ( N == M ) {
    ans = F . fact ( N ) * F . fact ( N ) * 2 % mod ;
  }
  else {
    ans = 0 ;
  }
  System . out . println ( ans ) ;
}
