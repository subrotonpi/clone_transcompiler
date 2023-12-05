static final Scanner raw_input = new Scanner ( System . in ) {
  @ Override public int next ( ) {
    int T = Integer . parseInt ( raw_input . nextLine ( ) ) ;
    for ( int TK = xrange ( T ) ;
    TK < T ;
    TK ++ ) {
      int R = Integer . parseInt ( raw_input . nextLine ( ) ) ;
      int C = Integer . parseInt ( raw_input . nextLine ( ) ) ;
      char [ ] [ ] grid = new char [ R ] [ C ] ;
      for ( int i = xrange ( R ) ;
      i < grid . length ;
      i ++ ) {
        grid [ i ] = new char [ R ] ;
        grid [ i ] [ i ] = raw_input . nextLine ( ) ;
        grid [ i ] [ i ] = new char [ R ] ;
      }
      for ( int i = xrange ( R ) ;
      i < grid . length ;
      i ++ ) {
        for ( int j = xrange ( C ) ;
        j < grid . length ;
        j ++ ) {
          if ( grid [ i ] [ j ] != '?' ) {
            for ( int k = xrange ( 1 , C ) ;
            k < grid . length ;
            k ++ ) {
              if ( j - k >= 0 && grid [ i ] [ j - k ] == '?' ) {
                grid [ i ] [ j - k ] = grid [ i ] [ j ] ;
              }
              else {
                break ;
              }
            }
            for ( int k = xrange ( 1 , C ) ;
            k < grid . length ;
            k ++ ) {
              if ( j + k < grid . length && grid [ i ] [ j + k ] == '?' ) {
                grid [ i ] [ j + k ] = grid [ i ] [ j ] ;
              }
              else {
                break ;
              }
            }
          }
        }
      }
    }
    for ( int i = xrange ( R ) ;
    i < grid . length ;
    i ++ ) {
      if ( i > 0 && Arrays . equals ( grid [ i ] , '?' ) ) {
        grid [ i ] = grid [ i - 1 ] ;
      }
    }
    for ( int i = xrange ( R - 2 , - 1 , - 1 ) ;
    i < grid . length ;
    i ++ ) {
      if ( Arrays . equals ( grid [ i ] , '?' ) ) {
        grid [ i ] = grid [ i + 1 ] ;
      }
    }
    System . out . println ( "Case #" + ( TK + 1 ) + ":" ) ;
    for ( int i = xrange ( R ) ;
    i < grid . length