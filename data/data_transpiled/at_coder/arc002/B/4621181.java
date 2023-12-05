public static int y ( ) {
  int y = ( int ) ( n [ 0 ] + n [ 1 ] + n [ 2 ] + n [ 3 ] ) , m = ( int ) ( n [ 5 ] + n [ 6 ] ) , d = ( int ) ( n [ 8 ] + n [ 9 ] ) ;
  int [ ] D = {
    31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
    ;
    /* uruu */
    if ( m == 2 ) {
      if ( y % 400 == 0 ) return 1 ;
      else if ( y % 100 == 0 ) return 0 ;
    }
    return 0 ;
  }
  