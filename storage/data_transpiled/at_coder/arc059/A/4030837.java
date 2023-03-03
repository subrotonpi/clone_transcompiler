public static void print ( int a ) {
  int [ ] b = Integer . valueOf ( input . nextLine ( ) ) . split ( " " ) ;
  int c = Arrays . stream ( b ) . mapToInt ( Integer :: valueOf ) . sum ( ) / a ;
  double [ ] d = {
    0 , 0 }
    ;
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      d [ 0 ] += ( b [ i ] - c ) * ( b [ i ] - c - 1 ) ;
    }
    System . out . println ( min ( d ) ) ;
  }
  