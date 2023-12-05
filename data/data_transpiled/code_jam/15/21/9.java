static final int solve ( int n ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkPermission ( Permission perm ) {
      super . checkPermission ( perm ) ;
    }
  }
  ) ;
  /*if ((n <= 10) || (n % 10) == 0)
  return n;
  if ((n % 10) == 0)
  return solve(n-1)+1;
  */
  String x = Integer . toString ( n ) ;
  int p = x . length ( ) ;
  String a = x . substring ( p / 2 ) ;
  String b = x . substring ( 0 , p / 2 ) ;
  int q = 1 ;
  while ( ( q <= n ) && ( q < 10 ) ) q *= 10 ;
  q /= 10 ;
  int tmp = ( Integer . parseInt ( b . substring ( 0 , b . length ( ) - 1 ) ) - 1 ) ;
  if ( ( tmp == 0 ) && ( a . length ( ) == 0 ) ) return solve ( q ) + Integer . parseInt ( a ) ;
  else return solve ( q ) + Integer . parseInt ( a ) + tmp + 1 ;
}
