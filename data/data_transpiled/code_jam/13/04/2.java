private static int [ ] readLine ( ) {
  return new int [ ] {
    Integer . parseInt ( readLine ( ) ) }
    ;
    /* Case #*/
    int [ ] keys = new int [ 210 ] ;
    int [ ] chests = new int [ 210 ] ;
    int [ ] [ ] groups = new int [ 210 ] [ 210 ] ;
    int [ ] order = new int [ 210 ] ;
    int K = 0 ;
    int C = 0 ;
    System . arraycopy ( readLine ( ) , 0 , order , K , 0 ) ;
    System . arraycopy ( readLine ( ) , 0 , groups , K , 0 , K ) ;
    System . arraycopy ( readLine ( ) , 0 , order , K , K ) ;
    if ( ! isSolvable ( keys [ 0 ] , chests , new String [ ] {
    }
    ) ) {
      System . out . println ( "Case #" + ( v + 1 ) + ": IMPOSSIBLE" ) ;
    }
    else {
      while ( order [ K ] < C ) {
        for ( int i = 0 ;
        i < order [ K ] ;
        i ++ ) {
          if ( opened [ i ] ) continue ;
          openchest ( i ) ;
          if ( isSolvable ( keys [ 0 ] , chests , new String [ ] {
          }
          ) ) {
            opened [ i ] = true ;
            order [ K ] ++ ;
            break ;
          }
          keys [ K ] ++ ;
          for ( int i = 0 ;
          i < order [ K ] ;
          i ++ ) {
            groups [ K ] [ i ] -- ;
          }
        }
        System . out . println ( "Case #" + ( v + 1 ) + ": " + Arrays . toString ( order ) ) ;
      }
    }
    ;
    boolean rule1 ;
    do {
      rule1 = false ;
      for ( int i = 0 ;
      i < order [ K ] ;
      i ++ ) {
        if ( groups [ K ] [ i ] == 0 ) throw new RuntimeException ( ) ;
        if ( color [ K ] == 2 ) continue ;
        if ( color [ K ] == 1 ) continue ;
        dfs ( i ) ;
      }
      trail [ K ] ++ ;
    }
    while ( ! isSolvable ( keys [ 0 ] , chests , new String [ ] {
    }
    ) ) ;
    System . out . println ( "Case #" + ( v + 1 ) + ": " + Arrays . toString ( order ) ) ;
    return order ;
  }
  