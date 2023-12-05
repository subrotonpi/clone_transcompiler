static final int solve ( int n , int r ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  class FactMod implements FactorialMod {
    int mod ;
    int [ ] f = new int [ n + 1 ] ;
    int i ;
    int [ ] inv = new int [ n + 1 ] ;
    Arrays . fill ( inv , 1 ) ;
    for ( i = 1 ;
    i <= n ;
    i ++ ) {
      f [ i ] = f [ i - 1 ] * i % mod ;
    }
    inv [ n ] = Math . pow ( f [ n - 1 ] , mod - 2 , mod ) ;
  }
  return f [ n ] ;
}
