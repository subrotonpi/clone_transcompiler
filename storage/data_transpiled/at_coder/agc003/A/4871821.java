public static void input ( ) {
  int N = S . length ;
  int [ ] d = {
    0 , 0 , 0 , 0 }
    ;
    char [ ] s = {
      'N' , 'W' , 'S' , 'E' }
      ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        for ( int j = 0 ;
        j < 4 ;
        j ++ ) {
          if ( S [ i ] == s [ j ] ) {
            d [ j ] ++ ;
            break ;
          }
        }
      }
      boolean flag = true ;
      if ( ( d [ 0 ] == 0 && d [ 2 ] == 0 ) || ( d [ 0 ] != 0 && d [ 2 ] != 0 ) ) {
      }
      else {
        flag = false ;
      }
      if ( ( d [ 1 ] == 0 && d [ 3 ] == 0 ) || ( d [ 1 ] != 0 && d [ 3 ] != 0 ) ) {
      }
      else {
        flag = false ;
      }
      if ( flag ) {
        System . out . println ( "Yes" ) ;
      }
      else {
        System . out . println ( "No" ) ;
      }
    }
    