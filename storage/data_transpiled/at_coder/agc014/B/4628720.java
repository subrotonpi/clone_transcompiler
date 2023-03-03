static final void print ( String s ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( s ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] node = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    node [ a ] ^= 1 ;
    node [ b ] ^= 1 ;
  }
  if ( ArrayUtil . find ( node , 0 ) > - 1 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
