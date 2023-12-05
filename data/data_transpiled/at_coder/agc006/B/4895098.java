public static void main ( String input , int n , int x ) {
  if ( x == 1 || x == 2 * n - 1 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
    if ( n == 2 ) {
      System . out . println ( 1 ) ;
      System . out . println ( 2 ) ;
      System . out . println ( 3 ) ;
    }
    else {
      int [ ] a = new int [ 2 * n - 1 ] ;
      for ( int i = 0 ;
      i < 2 * n - 1 ;
      i ++ ) {
        a [ i ] = 0 ;
      }
      if ( x == 2 * n - 2 ) {
        a [ n - 3 ] = x - 2 ;
        a [ n - 2 ] = x + 1 ;
        a [ n - 1 ] = x ;
        a [ n ] = x - 1 ;
      }
      else {
        a [ n - 3 ] = x + 1 ;
        a [ n - 2 ] = x - 1 ;
        a [ n - 1 ] = x ;
        a [ n ] = x + 2 ;
      }
      int y = 1 ;
      for ( int i = 0 ;
      i < 2 * n - 1 ;
      i ++ ) {
        if ( y == x - 1 ) {
          y = x + 3 ;
        }
        if ( a [ i ] == 0 ) {
          a [ i ] = y ;
          y ++ ;
        }
      }
      for ( int t : a ) {
        System . out . println ( t ) ;
      }
    }
  }
}
