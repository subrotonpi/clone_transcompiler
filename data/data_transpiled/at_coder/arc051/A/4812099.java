public static void print ( int x1 , int y1 , int r ) {
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = x1 - r ;
  int b = y1 - r ;
  int c = x1 + r ;
  int d = y1 + r ;
  if ( x2 <= a && y2 <= b && x3 >= c && y3 >= d ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  double d1 = ( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) ) * 0.5 ;
  double d2 = ( ( x1 - x3 ) * ( x1 - x2 ) + ( y1 - y3 ) * ( y1 - y2 ) ) * 0.5 ;
  double d3 = ( ( x1 - x2 ) * ( x1 - x3 ) + ( y1 - y2 ) * ( y1 - y3 ) ) * 0.5 ;
  double d4 = ( ( x1 - x3 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) ) * 0.5 ;
  if ( d1 <= r && d2 <= r && d3 <= r && d4 <= r ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
