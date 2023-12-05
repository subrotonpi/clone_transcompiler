public static void print ( int x1 , int y1 , int r ) {
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x2 <= x1 - r && x1 + r <= x3 && y2 <= y1 - r && y1 + r <= y3 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  int dx2 = Math . abs ( x1 - x2 ) ;
  int dx3 = Math . abs ( x1 - x3 ) ;
  int dy2 = Math . abs ( y1 - y2 ) ;
  int dy3 = Math . abs ( y1 - y3 ) ;
  int d = Math . max ( dx2 * dx2 + dy2 * dx2 , dx2 * dx2 + dy3 * dx2 , dx3 * dx3 + dy2 * dx3 , dx3 * dx3 + dy3 * dy2 ) ;
  if ( d <= r * r ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
