public static boolean [ ] [ ] [ ] H = {
  int [ ] [ ] . values ( ) , W = {
    int [ ] . values ( ) }
    ;
    char [ ] a = new char [ H ] [ ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) a [ i ] = input . charAt ( i ) ;
    boolean [ ] [ ] R = new boolean [ W ] [ H ] ;
    boolean [ ] [ ] B = new boolean [ W ] [ H ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      R [ i ] [ 0 ] = B [ i ] [ W - 1 ] = true ;
      if ( i % 2 == 0 ) {
        for ( int j = 1 ;
        j <= W - 1 ;
        j ++ ) R [ i ] [ j ] = true ;
      }
      else {
        for ( int j = 1 ;
        j <= W - 1 ;
        j ++ ) B [ i ] [ j ] = true ;
      }
    }
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        if ( a [ i ] [ j ] == '#' ) R [ i ] [ j ] = B [ i ] [ j ] = true ;
      }
    }
    for ( boolean [ ] [ ] row : R ) {
      for ( int j = 0 ;
      j < row . length ;
      j ++ ) System . out . print ( "#" ) ;
      System . out . print ( "." ) ;
    }
    System . out . println ( ) ;
    for ( boolean [ ] [ ] row : B ) {
      for ( int j = 0 ;
      j < row . length ;
      j ++ ) System . out . print ( "#" ) ;
      System . out . print ( "." ) ;
    }
    System . out . println ( ) ;
    return R ;
  }
  