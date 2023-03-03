public static int solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  HashMap < Integer , Integer > memo = new HashMap < Integer , Integer > ( ) ;
  /* tri */
  if ( ( L < 0 ) || ( L > 0 ) ) {
    return memo . get ( L , m ) ;
  }
  if ( L == 0 ) {
    if ( m == 0 ) return 2 ;
    return 1 ;
  }
  int res = 0 ;
  if ( m == 0 ) {
    res += tri ( L - 1 , 0 ) * 2 ;
    res += tri ( L - 1 , 0 ) * ( tri ( L - 1 , 0 ) - tri ( L - 1 , 1 ) ) ;
  }
  else {
    res += 1 ;
  }
  int r = 0 ;
  return r ;
}
