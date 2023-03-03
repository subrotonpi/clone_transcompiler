@ Sys public static int solve ( ) {
  int T = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* rev N = 0 */
  int n = N ;
  int ret = 0 ;
  while ( n > 0 ) {
    ret *= 10 ;
    ret += n % 10 ;
    n = n / 10 ;
    /* pass */
  }
  /* solve N */
  if ( N <= 19 ) {
    return N ;
  }
  else {
    int keta = ( int ) Math . log10 ( N ) ;
    int prev = 10 * keta - 1 ;
    int keta_dn = keta / 2 + 1 ;
    int up = rev ( N / ( 10 * keta_dn ) ) ;
    int dn = N % ( 10 * keta_dn ) ;
    if ( dn == 0 ) {
      return solve ( N - 1 ) + 1 ;
    }
    else if ( up == 1 ) {
      return solve ( prev ) + 1 + dn ;
    }
    else {
      return solve ( prev ) + 1 + up + dn ;
    }
  }
}
