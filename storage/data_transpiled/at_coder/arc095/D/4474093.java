public static void solve ( int n , int [ ] [ ] adjList , int [ ] d ) {
  int [ ] s = new int [ n ] ;
  int [ ] [ ] pathAdjList = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int v = input . nextInt ( ) - 1 ;
    int w = input . nextInt ( ) - 1 ;
    int [ ] p = pathAdjList [ v ] ;
    for ( int w : adjList [ v ] ) {
      if ( ++ w < d [ w ] ) {
        p [ w ] = w ;
      }
    }
    if ( 2 < p . length ) {
      System . out . println ( - 1 ) ;
      return ;
    }
    if ( p . length == 1 ) {
      s [ i ] = v ;
    }
  }
  if ( s . length == 0 ) {
    int [ ] ans = new int [ n ] ;
    ans [ 1 ] = 1 ;
    for ( int i = 3 ;
    i < n ;
    i ++ ) {
      ans [ i ] = v ;
      if ( 2 < n ) {
        ans [ i ] = n ;
      }
      System . out . println ( Arrays . toString ( ans ) ) ;
      return ;
    }
    boolean [ ] visited = new boolean [ n ] ;
    int v , w ;
    while ( v != w && d [ v ] == d [ w ] ) {
      visited [ v ] = true ;
      visited [ w ] = true ;
      boolean f = false ;
      for ( int nv : pathAdjList [ v ] ) {
        if ( ! visited [ nv ] ) {
          f = true ;
          v = nv ;
          break ;
        }
      }
      if ( ! f ) break ;
      f = false ;
      for ( int nw : pathAdjList [ w ] ) {
        if ( ! visited [ nw ] ) {
          f = true ;
          w = nw ;
          break ;
        }
      }
      if ( ! f ) break ;
    }
    ans [ 0 ] = n ;
    System . out . println ( Arrays . toString ( ans ) ) ;
    return ;
  }
  {
    n = input . nextInt ( ) ;
  }
  int [ ] ans = new int [ n ] ;
  for ( int i = 3 ;
  i < n ;
  i ++ ) {
    ans [ i ] = w ;
  }
  int c = d [ v ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans [ i ] = n ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    