public static void print ( int n , int x ) {
  if ( x == 1 || x == 2 * n - 1 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
    if ( n == 2 ) {
      System . out . print ( ( ( int ) ( 1 ) ) + " " ) ;
    }
    else if ( x == 2 ) {
      int [ ] ans = {
        3 , 2 , 1 , 4 }
        ;
        int [ ] remain = new int [ n ] ;
        for ( int i = 5 ;
        i < 2 * n ;
        i ++ ) {
          remain [ i ] = i ;
        }
        ans = remain . clone ( ) ;
        System . out . println ( ans ) ;
      }
      else {
        int [ ] ans = {
          x - 1 , x , x + 1 , x - 2 }
          ;
          int [ ] remain = new int [ n ] ;
          for ( int i = 1 ;
          i < x - 2 ;
          i ++ ) {
            remain [ i ] = i ;
          }
          ans = remain . clone ( ) ;
          System . out . println ( ans ) ;
        }
      }
    }
    