public static int go ( int r , int c , int n , int s , int p ) {
  int [ ] [ ] a = new int [ xrange ( c ) ] [ xrange ( r ) ] ;
  for ( int j : xrange ( T ) ) {
    System . out . println ( "Case #" + ( j + 1 ) + ": " + solve ( ) ) ;
  }
  for ( int b : xrange ( 4 , - 1 , - 1 ) ) {
    for ( int i : xrange ( r ) ) {
      for ( int j : xrange ( c ) ) {
        if ( n <= 0 ) {
          return s / 2 ;
        }
        if ( a [ i ] [ j ] == b && ( i + j ) % 2 == p ) {
          s -= b * 2 ;
          a [ i ] [ j ] -= b ;
          if ( i > 0 && a [ i - 1 ] [ j ] != 0 ) {
            a [ i - 1 ] [ j ] -= 1 ;
          }
          if ( i < r - 1 && a [ i + 1 ] [ j ] != 0 ) {
            a [ i + 1 ] [ j ] -= 1 ;
          }
          if ( j > 0 && a [ i ] [ j - 1 ] != 0 ) {
            a [ i ] [ j - 1 ] -= 1 ;
          }
          if ( j < c - 1 && a [ i ] [ j + 1 ] != 0 ) {
            a [ i ] [ j + 1 ] -= 1 ;
          }
          n -- ;
        }
      }
    }
  }
  for ( int b : xrange ( 4 , - 1 , - 1 ) ) {
    for ( int i : xrange ( r ) ) {
      for ( int j : xrange ( c ) ) {
        if ( n <= 0 ) {
          return s / 2 ;
        }
        if ( a [ i ] [ j ] == b && ( i + j ) % 2 == 1 - p ) {
          s -= b * 2 ;
          a [ i ] [ j ] -= b ;
          if ( i > 0 && a [ i - 1 ] [ j ] != 0 ) {
            a [ i - 1 ] [ j ] -= 1 ;
          }
          if ( i < r - 1 && a [ i + 1 ] [ j ] != 0 ) {
            a [ i + 1 ] [ j ] -= 1 ;
          }
          if ( j > 0 && a [ i ] [ j - 1 ] != 0 ) {
            a [ i ] [ j - 1 ] -= 1 ;
          }
          n -- ;
        }
      }
    }
    