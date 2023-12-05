public static int x , int y ;
int [ ] a = {
  1 , 3 , 5 , 7 , 8 , 10 , 12 }
  ;
  int [ ] b = {
    4 , 6 , 9 , 11 }
    ;
    if ( ( x = a [ 0 ] ) && ( y = a [ 1 ] ) || ( x = b [ 0 ] ) && ( y = b [ 1 ] ) ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
    return a [ 0 ] ;
  }
  