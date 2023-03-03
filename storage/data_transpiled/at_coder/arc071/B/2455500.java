public static int input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  int [ ] y = new int [ m ] ;
  int MOD = 10 * 9 + 7 ;
  long ax = 0 ;
  long ay = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ax = ( ax + ( ( ( 2 * i - n + 1 ) * x [ i ] ) % MOD ) ) % MOD ;
  return ( int ) ( ( ax * ay ) % MOD ) ;
}
