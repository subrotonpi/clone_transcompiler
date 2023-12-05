public static int fact ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int Mod = 10 * 9 + 7 ;
  /* fact */
  int res = 1 ;
  for ( int i = 1 ;
  i <= l ;
  i ++ ) {
    res *= i ;
    res %= Mod ;
  }
  /* factinv */
  res = 1 ;
  for ( int i = 1 ;
  i <= l ;
  i ++ ) {
    res *= Math . pow ( i , Mod - 2 ) ;
    res %= Mod ;
  }
  return res ;
}
