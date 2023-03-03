public static int N = Integer . parseInt ( input ) {
  int MOD = ( int ) 1e+9 + 7 ;
  List < Integer > prime = new ArrayList < > ( ) ;
  prime . add ( 2 ) ;
  for ( int i = 2 ;
  i < 1001 ;
  i ++ ) {
    for ( int j = 2 ;
    j <= i - 1 ;
    j ++ ) {
      if ( i % j == 0 ) {
        break ;
      }
    }
    else {
      prime . add ( i ) ;
    }
  }
  int [ ] factor = new int [ 1000 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for ( int p : prime ) {
      if ( i == 1 ) {
        break ;
      }
      while ( i % p == 0 ) {
        i /= p ;
        factor [ p ] ++ ;
      }
    }
  }
  long ans = 1 ;
  for ( int fact : factor ) {
    ans *= fact ;
    ans %= MOD ;
  }
  System . out . println ( ( int ) ans ) ;
  return ans ;
}
