static final String getStdOut ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int n = Integer . parseInt ( input ) ;
  int i = 2 ;
  String ans = "YES" ;
  while ( i * i <= n ) {
    if ( n % i == 0 ) {
      ans = "NO" ;
      break ;
    }
    else {
      i ++ ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
