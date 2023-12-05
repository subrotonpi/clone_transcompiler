@ Sys public static int [ ] [ ] solve ( ) {
  int k ;
  for ( int caseNumber : xrange ( 1 , 1 + Integer . parseInt ( stdin . readLine ( ) ) ) ) {
    Arrays . fill ( R , - 1 ) ;
    int C = Integer . parseInt ( stdin . readLine ( ) ) ;
    int [ ] [ ] mx = new int [ R + 1 ] [ C - k ] ;
    for ( int z = stdin . readLine ( ) . toCharArray ( ) . length ;
    z > 0 ;
    z = stdin . readLine ( ) . toCharArray ( ) ) {
      for ( int i = 0 ;
      i < R ;
      i ++ ) {
        for ( int j = 0 ;
        j < C ;
        j ++ ) {
          if ( isBlade ( i , j , k ) ) {
            bladeFound = true ;
            break ;
          }
        }
      }
      if ( bladeFound ) break ;
      k -- ;
    }
    if ( ( k == 2 ) ? print ( "Case #" + caseNumber + ": IMPOSSIBLE" ) : print ( "Case #" + k + ": " + sum ( mx ) ) ;
    else print ( "Case #" + caseNumber + ": " + sum ( mx ) ) ;
    int [ ] [ ] mx2 = new int [ C + 1 ] [ R + 1 ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        mx2 [ i + 1 ] [ j + 1 ] = mx [ i ] [ j ] * mx [ i ] [ j ] ;
      }
    }
    for ( int i = 0 ;
    i < C ;
    i ++ ) {
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        mx2 [ i ] [ j ] = mx [ i ] [ j ] + mx [ i ] [ j - 1 ] [ k ] ;
      }
    }
    int i = Math . min ( C , R ) ;
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        mx2 [ i ] [ j ] = mx2 [ i ] [ j ] [ k ] + mx2 [ i - 1 ] [ j ] [ k ] ;
      }
    }
    k = Math . min ( C , R ) ;
  }
  /* sum(2*t[0]) */
  return mx2