public static void print ( int x1 , int y1 , int r ) {
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x3 - x1 >= r && x1 - x2 >= r && y3 - y1 >= r && y1 - y2 >= r ) {
    System . out . println ( "NO" ) ;
    System . out . println ( "YES" ) ;
  }
  else if ( ( x3 - x1 ) * ( x3 - x1 ) + ( y3 - y1 ) * ( y3 - y1 ) <= r * r && ( x3 - x1 ) * ( x3 - x1 ) + ( y2 - y1 ) * ( y3 - y1 ) <= r * r && ( x2 - x1 ) * ( y3 - y1 ) <= r * r && ( x2 - x1 ) * ( y3 - y1 ) <= r * r && ( x2 - x1 ) * ( y3 - y1 ) <= r * r ) {
    System . out . println ( "YES" ) ;
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
    System . out . println ( "YES" ) ;
  }
}
