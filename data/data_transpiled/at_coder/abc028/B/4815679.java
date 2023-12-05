static void print ( String n ) {
  int [ ] a = {
    0 , 0 , 0 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < n . length ( ) ;
    i ++ ) {
      switch ( n . charAt ( i ) ) {
        case 'A' : a [ 0 ] ++ ;
        break ;
        case 'B' : a [ 1 ] ++ ;
        break ;
        case 'C' : a [ 2 ] ++ ;
        break ;
      }
    }
  }
  