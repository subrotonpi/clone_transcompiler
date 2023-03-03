public static int [ ] [ ] parse ( String input ) {
  int d = Integer . parseInt ( input ) , g = Integer . parseInt ( input ) ;
  int [ ] [ ] compPoints = new int [ d ] [ ] ;
  int [ ] P = new int [ d ] ;
  for ( int i = 0 ;
  i < d ;
  i ++ ) {
    int p = Integer . parseInt ( input ) ;
    int c = Integer . parseInt ( input ) ;
    compPoints [ i ] = new int [ ] {
      p , ( i + 1 ) * 100 * p + c }
      ;
      P [ i ] = p ;
    }
    int ans = 10 * 10 ;
    for ( int i = 0 ;
    i < 2 * d ;
    i ++ ) {
      String bit = format ( i , "b" ) . replaceAll ( " " , "" ) ;
      int count = 0 ;
      int point = 0 ;
      for ( int j = 0 ;
      j < bit . length ( ) ;
      j ++ ) {
        String dot = bit . substring ( j , j + 1 ) ;
        if ( dot . equals ( "1" ) ) {
          count += compPoints [ j ] [ 0 ] ;
          point += compPoints [ j ] [ 1 ] ;
        }
      }
      for ( int b = d - 1 ;
      b >= 0 ;
      b -- ) {
        boolean flag = false ;
        if ( point >= g ) {
          ans = Math . min ( ans , count ) ;
          break ;
        }
        if ( ( point < g ) & flag ) {
          break ;
        }
      }
    }
    System . out . println ( ans ) ;
    return compPoints ;
  }
  