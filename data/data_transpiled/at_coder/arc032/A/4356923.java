static final String getPrime ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  int s = Integer . parseInt ( input ) ;
  /* if N is 1 then return false */
  if ( N <= 1 ) {
    return false ;
  }
  int i = 2 ;
  while ( i * i <= N ) {
    if ( N % i == 0 ) {
      return false ;
    }
    i ++ ;
  }
  if ( ! isPrime ( s ) ) {
    System . out . println ( "BOWWOW" ) ;
  }
  else {
    System . out . println ( "WANWAN" ) ;
  }
  return s ;
}
