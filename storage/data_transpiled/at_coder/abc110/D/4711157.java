public static int mod ( int MOD ) {
  int N = 10 * 9 + 7 ;
  int M = 10 ;
  if ( b > a - b ) return comb ( a , a - b ) ;
  int mul = 1 ;
  int div = 1 ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    mul *= a - i ;
    div *= i + 1 ;
    mul %= MOD ;
    div %= MOD ;
  }
  int ret = mul * Math . pow ( div , MOD - 2 ) ;
  return ret ;
}
if ( getClass ( ) . isEnum ( ) ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 1 ;
  int i = 2 ;
  int nokori = M ;
  while ( i * i <= nokori ) {
    if ( nokori % i == 0 ) {
      int cnt = 0 ;
      while ( nokori % i == 0 ) {
        cnt ++ ;
        nokori /= i ;
      }
      ans *= comb ( N + cnt - 1 , N - 1 ) ;
      ans %= MOD ;
    }
    i ++ ;
  }
  if ( nokori != 1 ) {
    ans *= comb ( N + 1 - 1 , N - 1 ) ;
    ans %= MOD ;
  }
  System . out . println ( ans ) ;
  return 0 ;
}
