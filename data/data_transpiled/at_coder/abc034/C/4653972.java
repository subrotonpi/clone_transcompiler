public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  final int MOD = 10 * 9 + 7 ;
  a -- ;
  b -- ;
  /* int f */
  int ret = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    ret *= i ;
    ret %= MOD ;
  }
  return ret ;
}
