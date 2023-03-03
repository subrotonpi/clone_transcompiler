public static int A = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
int C = Integer . parseInt ( input ) ;
final int MOD = 1000000007 ;
{
  if ( n == 0 ) {
    return 1 ;
  }
  int res = modPow ( x * x % MOD , n / 2 ) ;
  if ( ( n & 1 ) != 0 ) {
    return res * x % MOD ;
  }
  else {
    return res % MOD ;
  }
}
