public static long modPower ( long n , long p , long m ) {
  if ( p == 0 ) return 1 ;
  if ( p % 2 == 0 ) {
    long half = modPower ( n , p / 2 , m ) ;
    return half * half % m ;
  }
  else {
    return n * modPower ( n , p - 1 , m ) ;
  }
  int n = Integer . parseInt ( input ( ) ) ;
  long [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input ( ) ) ;
  long [ ] csumInvs = new long [ n + 1 ] ;
  long t = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    t += modPower ( i , MOD - 2 , MOD ) ;
    t %= MOD ;
    csumInvs [ i ] = t ;
  }
  long ans *= fact [ n - 1 ] ;
  ans %= MOD ;
  System . out . println ( ans ) ;
  return n ;
}
