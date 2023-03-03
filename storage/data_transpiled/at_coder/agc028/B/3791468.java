public static final int getExponent ( ) {
  final String fin = System . getProperty ( "line.separator" ) ;
  System . setSecurityManager ( new SecurityManager ( ) {
    public void checkExit ( int level ) {
      System . out . println ( level ) ;
    }
  }
  ) ;
  int mod = 10 * 9 + 7 ;
  int N = Integer . parseInt ( fin . substring ( 0 , fin . indexOf ( ' ' ) ) ) ;
  List < Integer > A_list = new ArrayList < Integer > ( ) ;
  for ( String elem : fin . substring ( fin . indexOf ( ' ' ) + 1 ) . split ( " " ) ) A_list . add ( Integer . parseInt ( elem ) ) ;
  int fac_N = factorial ( N , MOD ) ;
  int [ ] inv_nums = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) inv_nums [ i ] = fac_N * Math . pow ( i , MOD - 2 , MOD ) % MOD ;
  int [ ] cuml_inv_nums = new int [ N ] ;
  cuml_inv_nums [ N ] = inv_nums [ 0 ] ;
  for ( int i = 1 ;
  i < inv_nums . length ;
  i ++ ) {
    cuml_inv_nums [ N - 1 - i ] = ( cuml_inv_nums [ N - 1 - i ] + inv_nums [ 0 ] ) % MOD ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += A * ( cuml_inv_nums [ i ] + cuml_inv_nums [ N - 1 - i ] - cuml_inv_nums [ 0 ] ) % MOD ;
    ans %= MOD ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
