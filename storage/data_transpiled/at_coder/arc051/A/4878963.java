public static void main ( String [ ] args ) {
  int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x2 <= x1 - r && x1 + r <= x3 && y2 <= y1 - r && y1 + r <= y3 ) {
    System . out . println ( "NO\nYES" ) ;
  }
  else if ( ( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ) ) <= r * r && ( x2 - x1 ) * ( x3 - x1 ) + ( y2 - y1 ) * ( y3 - y1 ) <= r * r && ( x3 - x1 ) * ( x3 - x1 ) + ( y2 - y1 ) * ( y3 - y1 ) <= r * r ) {
    System . out . println ( "YES\nNO" ) ;
  }
  else {
    System . out . println ( "YES\nYES" ) ;
  }
}
