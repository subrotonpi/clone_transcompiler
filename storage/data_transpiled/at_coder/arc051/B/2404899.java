public static int n ( ) {
  int [ ] x = {
    1 , 2 }
    ;
    for ( int i = 0 ;
    i < n - 2 ;
    i ++ ) x [ i ] = x [ x . length - 1 ] + x [ x . length - 2 ] ;
    if ( n != 1 ) System . out . println ( x [ x . length - 2 ] + " " + x [ x . length - 1 ] ) ;
    else System . out . println ( 1 ) ;
    return 1 ;
  }
  