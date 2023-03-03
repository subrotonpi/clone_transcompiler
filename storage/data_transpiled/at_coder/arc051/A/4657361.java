public static void print ( int x1 , int y1 , int r ) {
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( x2 <= ( x1 - r ) && x3 >= ( x1 + r ) ) && ( y2 <= ( y1 - r ) && y3 >= ( y1 + r ) ) ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  int r1 = ( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) ) ;
  int r2 = ( ( x1 - x3 ) * ( x1 - x3 ) + ( y1 - y3 ) * ( y1 - y3 ) ) ;
  int r3 = ( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( x1 - x3 ) ) ;
  int r4 = ( ( x1 - x3 ) * ( y1 - y2 ) + ( y1 - y2 ) * ( x1 - x3 ) ) ;
  if ( ( r1 > r * r || r2 > r * r || r3 > r * r || r4 > r * r ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
