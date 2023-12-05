static final void dfs ( int v ) {
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  String s = input . readLine ( ) ;
  int [ ] [ ] links = new int [ 2 * n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    links [ i ] = new int [ 2 * n ] ;
  }
  int [ ] visit = new int [ n * 2 ] ;
  while ( true ) {
    visit [ v ] = 1 ;
    for ( int i : links [ v ] ) {
      if ( visit [ i ] == 1 ) {
        System . out . println ( "Yes" ) ;
        exit ( ) ;
      }
      else if ( visit [ i ] == 0 ) {
        dfs ( i ) ;
      }
    }
  }
}
