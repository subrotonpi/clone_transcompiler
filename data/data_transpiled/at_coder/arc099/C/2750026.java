public static Graph < Integer > createGraph ( int nvert , List < Edge < Integer >> edges ) {
  {
    adj = new boolean [ nvert ] [ nvert ] ;
    for ( int i = 0 ;
    i < nvert ;
    i ++ ) {
      adj [ i ] [ i ] = false ;
    }
    for ( Edge < Integer > e : edges ) {
      int u = e . getU ( ) ;
      int v = e . getV ( ) ;
      adj [ u ] [ v ] = true ;
      adj [ v ] [ u ] = true ;
    }
  }
  {
    String s = Integer . toString ( nvert ) ;
  }
  {
    int N = Integer . parseInt ( s ) ;
    int M = Integer . parseInt ( s ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int a = Integer . parseInt ( s ) ;
      int b = Integer . parseInt ( s ) ;
      edges . add ( new Edge < Integer > ( a - 1 , b - 1 ) ) ;
    }
  }
  {
    int x = Integer . parseInt ( s ) ;
    int y = Integer . parseInt ( s ) ;
    int nearlyhalfdiff = Math . min ( ( x - 1 ) , y ) ;
    int diff = Math . abs ( diff ) - 2 * nearlyhalfdiff ;
    int x = ( N - diff ) / 2 ;
    int y = x * ( x - 1 ) / 2 ;
    System . out . println ( x + y ) ;
  }
  {
    boolean [ ] [ ] ccs = new boolean [ nvertices ] [ nvert ] ;
    for ( int i = 0 ;
    i < nvertices ;
    i ++ ) {
      if ( ccs [ i ] [ 0 ] == 0 ) continue ;
      g . adj [ u ] [ v ] = ! ccs [ i ] [ 1 ] ;
      g . adj [ v ] [ u ] = ! ccs [ i ] [ 1 ] ;
    }
  }
  {
    visited = new boolean [ nvertices ] [ nvert ] ;
    ccs = new boolean [ nvertices ] ;
    for ( int i = 0 ;
    i < nvertices ;
    i ++ ) {
      if ( ccs [ i ] [ 0 ] == 0 ) return null ;
      visited [ i ] = true ;
      vs [ i ] = i ;
    }
  }
  {
    int n = Integer . parseInt ( s ) ;
    int m = Integer . parseInt ( s ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ccs [ i ] [