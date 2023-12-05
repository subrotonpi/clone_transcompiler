static final String print ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] node = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    node [ a ] ++ ;
    node [ b ] ++ ;
  }
  if ( Arrays . equals ( node , node ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return node [ N ] ;
}
