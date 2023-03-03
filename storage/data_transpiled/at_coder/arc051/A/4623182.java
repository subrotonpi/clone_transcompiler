public static void circle ( int x1 , int y1 , int r ) {
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x1_max = x1 + r ;
  int x1_min = x1 - r ;
  int y1_max = y1 + r ;
  int y1_min = y1 - r ;
  /* Check if the circle is between the two points */
  if ( x2 <= x1_max && x3 <= x1_min && y2 <= y1_max && x3 >= y1_min ) {
    System . out . println ( "YES" ) ;
    System . out . println ( "NO" ) ;
  }
  else if ( x2 <= x1_min && x3 <= x1_max && y2 <= y1_min && y3 >= y1_max ) {
    System . out . println ( "NO" ) ;
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
    System . out . println ( "YES" ) ;
  }
}
