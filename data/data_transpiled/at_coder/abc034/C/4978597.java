public static int modCombination ( int n , int k , int mod ) {
  /* if b == 0 else {
  int d = extGCD(b, a%b);
  x = extGCD(b, a%b);
  x -= (a/b)*y;
  }*/
  long p = 1 , q = 1 ;
  for ( int i = n - k + 1 ;
  i <= n ;
  i ++ ) p = ( p * i ) % mod ;
  for ( int i = 2 ;
  i <= k ;
  i ++ ) q = ( q * i ) % mod ;
  return ( int ) ( p * ( extGCD ( q , mod ) [ 1 ] % mod ) % mod ) ;
}
