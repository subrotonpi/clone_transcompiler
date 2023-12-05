public static void print ( int x1 , int y1 , int r ) {
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x2 + r <= x1 && x1 <= x3 - r && y2 + r <= y1 && y1 <= y3 - r ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  if ( Math . max ( Math . abs ( x3 - x1 ) , Math . abs ( x2 - x1 ) ) * Math . max ( Math . abs ( x3 - x1 ) , Math . abs ( x2 - x1 ) ) + Math . max ( Math . abs ( y3 - y1 ) , Math . abs ( y2 - y1 ) ) * Math . max ( Math . abs ( y3 - y1 ) , Math . abs ( y2 - y1 ) ) <= r * r ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
