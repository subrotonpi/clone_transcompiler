public static int x , int y ;
int [ ] A = {
  1 , 3 , 5 , 7 , 8 , 10 , 12 }
  ;
  int [ ] B = {
    4 , 6 , 9 , 11 }
    ;
    int [ ] C = {
      2 }
      ;
      for ( int [ ] X : A ) {
        if ( X [ 0 ] == x && X [ 1 ] == y ) {
          System . out . println ( "Yes" ) ;
          break ;
        }
      }
      else {
        System . out . println ( "No" ) ;
      }
      return A [ 0 ] ;
    }
    