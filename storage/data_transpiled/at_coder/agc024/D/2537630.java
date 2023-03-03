public static int n = Integer . parseInt ( input ) {
  int [ ] [ ] sus = new int [ n ] [ n ] ;
  int [ ] edges = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    a -- ;
    b -- ;
    sus [ a ] [ i ] = b ;
    sus [ b ] [ i ] = a ;
    edges [ i ] = new int [ a ] ;
  }
  int p1 ;
  int p2 ;
  {
    boolean [ ] bio = new boolean [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) bio [ i ] = false ;
    int [ ] maks = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) maks [ i ] = 0 ;
    {
      synchronized ( bio ) {
        synchronized ( maks ) {
          bio [ i ] = true ;
        }
        int djece = 0 ;
        for ( int y : sus [ i ] ) {
          if ( ! bio [ y ] ) {
            dfs ( y , level + 1 ) ;
            djece ++ ;
          }
        }
        maks [ i ] = Math . max ( maks [ i ] , djece ) ;
      }
    }
  }
  if ( korijen instanceof int [ ] ) {
    int k1 = ( int [ ] ) korijen ;
    int k2 = ( int [ ] ) korijen ;
    bio [ k1 ] = bio [ k2 ] = true ;
    dfs ( k1 , 0 ) ;
    dfs ( k2 , 0 ) ;
    a = 1 ;
    b = 2 ;
  }
  else {
    dfs ( korijen , 0 ) ;
    a = 1 ;
    b = 1 ;
  }
  for ( int l = 0 ;
  l < n ;
  l ++ ) {
    if ( maks [ l ] ) {
      b *= maks [ l ] ;
      a ++ ;
    }
    else {
      break ;
    }
  }
  p1 = Math . min ( p1 , p2 ) ;
  p2 = Math . min ( p2 , edges ) ;
  p = Math . min ( p1 , p2 ) ;
  System . out . println ( p [ 0 ] + " " + p [ 1 ] ) ;
  return p1 ;
}
