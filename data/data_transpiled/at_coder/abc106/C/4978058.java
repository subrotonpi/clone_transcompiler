static final int [ ] S = new int [ ] {
  Integer . parseInt ( input ) , K }
  ;
  int idx = 0 ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    K [ i ] = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
    if ( S [ 0 ] == 1 ) {
      length = 1 ;
      for ( int i = 1 ;
      i < S . length ;
      i ++ ) {
        if ( S [ i ] == 1 ) {
          length ++ ;
          break ;
        }
        else {
          idx = i ;
          break ;
        }
      }
    }
    else {
      System . out . println ( S [ 0 ] ) ;
      System . exit ( 0 ) ;
    }
    if ( S . length == length ) System . out . println ( 1 ) ;
    else {
      if ( K - 1 < idx ) System . out . println ( 1 ) ;
      else System . out . println ( S [ idx ] ) ;
    }
  }
  