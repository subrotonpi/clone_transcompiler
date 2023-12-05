static public int main ( String [ ] args ) {
  final int INF = 10 * * 18 ;
  final int MOD = 10 * * 9 + 7 ;
  {
    final int [ ] LI = new int [ 10 ] ;
    for ( int i = 0 ;
    i < LI . length ;
    i ++ ) {
      LI [ i ] = Integer . parseInt ( args [ i ] ) ;
    }
    final int [ ] LI_ = new int [ 10 ] ;
    for ( int i = 0 ;
    i < LI_ . length ;
    i ++ ) {
      LI_ [ i ] = Integer . parseInt ( args [ i ] ) - 1 ;
    }
    final int [ ] LF = new int [ 10 ] ;
    for ( int i = 0 ;
    i < LF . length ;
    i ++ ) {
      LF [ i ] = Float . parseFloat ( args [ i ] ) ;
    }
    final int [ ] LS = new int [ 10 ] ;
    for ( int i = 0 ;
    i < LS . length ;
    i ++ ) {
      LS [ i ] = Integer . parseInt ( args [ i ] ) ;
    }
    final int [ ] II = new int [ 10 ] ;
    for ( int i = 0 ;
    i < II . length ;
    i ++ ) {
      II [ i ] = Integer . parseInt ( args [ i ] ) ;
    }
    final int [ ] SI = new int [ 10 ] ;
    for ( int i = 0 ;
    i < SI . length ;
    i ++ ) {
      SI [ i ] = input ( ) ;
    }
    @ SuppressWarnings ( "unused" ) final int N = LI [ i ] , M = LI_ [ i ] ;
    final int [ ] factors = new int [ N ] ;
    for ( int i = 0 ;
    i < ( int ) M * 0.5 + 1 ;
    i ++ ) {
      if ( primes [ i ] != 0 ) {
        while ( M % i == 0 ) {
          factors [ i ] ++ ;
          M /= i ;
        }
      }
      if ( M < i ) break ;
    }
    if ( M != 1 ) factors [ M ] ++ ;
    int ans = 1 ;
    for ( int k : factors . values ( ) ) {
      int a = 1 , b = 1 ;
      for ( int i = 1 ;
      i <= k ;
      i ++ ) {
        a *= N + k - i ;
        b *= i ;
      }
      ans = ( ans * ( a / b ) ) % MOD ;
    }
    return ans % MOD ;
  }
}
