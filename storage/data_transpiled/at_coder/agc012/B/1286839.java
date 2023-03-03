static final int [ ] [ ] getAdjacentNodes ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  Node [ ] [ ] node = new Node [ n + 1 ] [ ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    node [ a ] [ b ] = new Node [ a ] [ b ] ;
    node [ b ] [ a ] = new Node [ a ] [ b ] ;
  }
  int q = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] vdc = new int [ q ] [ 3 ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    vdc [ i ] [ 0 ] = vdc [ i ] [ 1 ] = Integer . parseInt ( input . readLine ( ) ) ;
    vdc [ i ] [ 2 ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  vdc = vdc . clone ( ) ;
  int [ ] ans = new int [ n + 1 ] ;
  int [ ] [ ] visited = new int [ 11 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans [ i ] = node [ i ] [ 0 ] ;
    visited [ i ] = 1 ;
    if ( ans [ i ] < 0 ) {
      return null ;
    }
    if ( visited [ i ] [ 0 ] ) {
      return null ;
    }
    visited [ i ] [ 0 ] = 1 ;
    if ( ans [ i ] == 0 ) {
      ans [ i ] = node [ i ] [ 1 ] ;
    }
    for ( int x : node [ i ] ) {
      ans [ i ] = node [ x ] [ 1 ] ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( ans [ i + 1 ] ) ;
  }
  return ans ;
}
