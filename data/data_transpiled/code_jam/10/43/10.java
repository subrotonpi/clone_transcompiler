static final psyco proxy = new psyco ( ) {
  @ Override public String toString ( ) {
    return "Proxy C Case " + caseNum ;
  }
  @ Override public int caseNum ( ) {
    return caseNum ;
  }
  @ Override public int R = Integer . parseInt ( s . readString ( ) ) ;
  int [ ] [ ] data = new int [ R ] [ R ] ;
  @ Override public int [ ] [ ] solve ( ) {
    return data ;
  }
  @ Override public int [ ] solve ( ) {
    boolean [ ] [ ] grid = new boolean [ 25 ] [ 110 ] ;
    for ( int i = 0 ;
    i < grid . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < grid [ i ] . length ;
      j ++ ) {
        for ( int j = 0 ;
        j < grid [ i ] [ j ] ;
        j ++ ) {
          grid [ i ] [ j ] = true ;
        }
      }
    }
    return solveGrid ( grid ) ;
  }
  @ Override public int [ ] solveGrid ( ) {
    boolean hasData = false ;
    for ( int i = 0 ;
    i < grid . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < grid [ i ] . length ;
      j ++ ) {
        for ( int j = 0 ;
        j < grid [ i ] [ j ] . length ;
        j ++ ) {
          if ( grid [ i ] [ j ] && grid [ i ] [ j ] [ j - 1 ] ) {
            hasData = true ;
            break ;
          }
        }
      }
    }
    if ( ! hasData ) {
      return 0 ;
    }
    boolean [ ] [ ] grid2 = new boolean [ 25 ] [ 110 ] ;
    for ( int i = 0 ;
    i < grid . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < grid [ i ] . length ;
      j ++ ) {
        for ( int j = 0 ;
        j < grid [ i ] [ j ] . length ;
        j ++ ) {
          if ( grid [ i ] [ j ] && grid [ i ] [ j ] [ j - 1 ] ) {
            grid2 [ i ] [ j ] = true ;
          }
          if ( grid [ i ] [ j ] && grid [ i ] [ j ] ) {
            grid2 [ i ] [ j ] = true ;
          }
          if ( grid [ i ] [ j - 1 ] && grid [ i ] [ j ] ) {
            grid2 [ i ] [ j ] = true ;
          }
        }
      }
    }
    return 1 + solveGrid