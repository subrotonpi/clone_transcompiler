static final String get ( int n , int [ ] [ ] graph ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkPermission ( Permission permission ) {
    }
  }
  ) ;
  int t = input . nextInt ( ) ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) {
    boolean [ ] visited = new boolean [ n ] ;
    Arrays . fill ( visited , false ) ;
    int [ ] order = new int [ n ] ;
    /* dfs now */
    if ( visited [ now ] ) return ;
    visited [ now ] = true ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      dfs ( graph [ now ] [ i ] ) ;
    }
    order [ x ] = now ;
  }
  for ( int x : xrange ( n ) ) {
    /* check now */
    boolean [ ] checked = new boolean [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      visited = new boolean [ n ] ;
      if ( checked [ i ] && check ( i ) ) return "Yes" ;
    }
    /* check now */
    checked [ x ] = false ;
  }
  for ( int x : new ArrayList < > ( order ) ) {
    boolean [ ] visited = new boolean [ n ] ;
    if ( ! checked [ x ] && check ( i ) ) return "No" ;
  }
  int n = input . nextInt ( ) ;
  graph = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    graph [ i ] = new int [ n ] ;
    for ( int y = 0 ;
    y < n ;
    y ++ ) {
      int [ ] nums = map . get ( input . nextInt ( ) ) ;
      for ( int z = 1 ;
      z < nums . length ;
      z ++ ) graph [ y ] [ z - 1 ] = nums [ z ] ;
    }
  }
  System . out . printf ( "Case #%d: %s%n" , x + 1 , get ( n , graph ) ) ;
}
