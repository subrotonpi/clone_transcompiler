public static int MOD = 10 * * 9 + 7 ;
int a = modPow ( a , p ) ;
if ( p == 0 ) return 1 ;
if ( p % 2 == 0 ) {
  int halfP = p / 2 ;
  int half = modPow ( a , halfP ) ;
  return half * half % MOD ;
}
else {
  return a * modPow ( a , p - 1 ) % MOD ;
}
/* comb the base and the base and the base */
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
int ret = mul * modPow ( div , MOD - 2 ) % MOD ;
/* print the result */
if ( getClass ( ) . isPrimitive ( ) ) {
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
}
