static final void print ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int m = Integer . parseInt ( input ) , n = Integer . parseInt ( input ) , N = Integer . parseInt ( input ) ;
  int ans = N ;
  int r = 0 ;
  while ( N >= m ) {
    r = N % m ;
    N = N / m * n ;
    ans += N ;
    N += r ;
  }
  System . out . println ( ans ) ;
}
