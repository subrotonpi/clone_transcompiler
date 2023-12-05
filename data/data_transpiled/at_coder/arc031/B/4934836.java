static final int [ ] [ ] getSolutionArray ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int ansFlag = 0 ;
  char [ ] [ ] field = new char [ 10 ] [ 10 ] ;
  char [ ] [ ] fieldU = new char [ 10 ] [ 10 ] ;
  char [ ] [ ] reached = new char [ 10 ] [ 10 ] ;
  int flag = 0 ;
  {
    if ( field [ y ] [ x ] == 'x' ) return field [ y ] ;
    if ( field [ y ] [ x ] == 'y' ) return field [ y ] ;
    if ( field [ x ] [ y ] == 1 ) return field [ x ] ;
    if ( field [ x ] [ y ] == 1 ) return field [ y ] ;
    if ( field [ x ] [ y ] == 1 ) return field [ x ] ;
    reached [ x ] [ y ] = 1 ;
    dfs ( x + 1 , y ) ;
    dfs ( x - 1 , y ) ;
    dfs ( x , y + 1 ) ;
    dfs ( x , y - 1 ) ;
  }
  int counter = 1 ;
  for ( int y = 0 ;
  y < 10 ;
  y ++ ) {
    for ( int x = 0 ;
    x < 10 ;
    x ++ ) {
      if ( field [ y ] [ x ] == 'o' ) {
        counter ++ ;
        first = new int [ ] {
          y , x }
          ;
        }
      }
    }
    for ( int y = 0 ;
    y < 10 ;
    y ++ ) {
      for ( int x = 0 ;
      x < 10 ;
      x ++ ) {
        if ( fieldU [ y ] [ x ] == 1 ) {
          fieldU [ y ] [ x ] = 0 ;
          dfs ( first [ 0 ] , first [ 1 ] ) ;
          int [ ] ans = new int [ reached . length ] ;
          for ( int i = 0 ;
          i < ans . length ;
          i ++ ) ans [ i ] = reached [ i ] ;
          ans = Arrays . copyOf ( ans , ans . length ) ;
          if ( counter == ans . length ) ansFlag = 1 ;
          reached = new char [ 10 ] [ 10 ] ;
          for ( int i = 0 ;
          i < ans . length ;
          i ++ ) ans [ i ] = 0 ;
          fieldU [ y ] [ x ] = 1 ;
        }
      }
    }
    if ( ansFlag == 1 ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" )