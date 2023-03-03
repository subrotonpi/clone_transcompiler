public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] l = {
    2 , 1 }
    ;
    for ( int i = 0 ;
    i < 85 ;
    i ++ ) {
      l [ i ] = l [ i ] + l [ i + 1 ] ;
    }
    System . out . println ( l [ N ] ) ;
    return N ;
  }
  