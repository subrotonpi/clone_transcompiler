static final String getPrime ( ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    public void checkPermission ( Permission permission ) {
    }
  }
  ) ;
  String input = System . getProperty ( "line.separator" ) ;
  /* Is it a prime? */
  if ( input . length ( ) < 2 ) {
    return ;
  }
  int i = 2 ;
  while ( i <= n ) {
    if ( input . charAt ( i ) == '0' ) {
      return ;
    }
    i ++ ;
  }
  return ans ;
}
