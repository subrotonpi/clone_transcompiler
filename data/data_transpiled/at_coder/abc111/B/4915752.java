public static int n ( ) {
  int [ ] a = {
    111 , 222 , 333 , 444 , 555 , 666 , 777 , 888 , 999 }
    ;
    int result = 0 ;
    for ( int i : a ) {
      if ( i >= n ) {
        result = i ;
        break ;
      }
    }
    System . out . println ( result ) ;
    return result ;
  }
  