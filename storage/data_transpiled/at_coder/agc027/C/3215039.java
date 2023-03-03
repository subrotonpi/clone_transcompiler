static final int [ ] [ ] G ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  String s = input . readLine ( ) ;
  int [ ] [ ] G = new int [ 2 * N ] [ 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) - 1 ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    if ( s . charAt ( a ) == s . charAt ( b ) ) {
      G [ a ] [ b ] = G [ b ] [ a ] ;
    }
    else G [ b ] [ a ] = G [ b ] [ a ] ;
  }
  return G ;
}
