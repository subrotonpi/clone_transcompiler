public static int modCombination ( int n , int k , int mod ) {
  long p = 1 , q = 1 ;
  for ( int i = n - k + 1 ;
  i <= n ;
  i ++ ) p = ( p * i ) % mod ;
  for ( int i = 2 ;
  i <= k ;
  i ++ ) q = ( q * i ) % mod ;
  return ( int ) ( p * ( Ext_Gcd ( q , mod ) [ 1 ] % mod ) % mod ) ;
}
