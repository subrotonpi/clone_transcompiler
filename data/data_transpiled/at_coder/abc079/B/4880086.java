public static void print ( int n ) {
  int [ ] lucas = {
    2 , 1 }
    ;
    for ( int i = 2 ;
    i < 100 ;
    i ++ ) {
      lucas [ i ] = lucas [ i - 1 ] + lucas [ i - 2 ] ;
    }
    System . out . println ( lucas [ n ] ) ;
  }
  