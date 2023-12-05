public static double comb ( int N , int K , int mod ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  double mod = 1000000007 ;
  double [ ] fact = new double [ n + k + 1 ] ;
  double [ ] rfact = new double [ n + k + 1 ] ;
  for ( int i = 0 ;
  i < n + k ;
  i ++ ) {
    fact [ i + 1 ] = rr = ( ( i + 1 ) * fact [ i ] ) % mod ;
    rfact [ i + 1 ] = Math . pow ( rr , mod - 2 , mod ) ;
  }
  return 0 ;
}
