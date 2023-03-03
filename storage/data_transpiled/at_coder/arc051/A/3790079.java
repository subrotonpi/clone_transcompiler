public static void print ( int x1 , int y1 , int r ) {
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  String red = "NO" ;
  String blue = "NO" ;
  if ( x2 > x1 - r || x1 + r > x3 || y2 > y1 - r || y1 + r > y3 ) {
    red = "YES" ;
  }
  for ( int x = x2 ;
  x <= x3 ;
  x ++ ) {
    for ( int y = y2 ;
    y <= y3 ;
    y ++ ) {
      if ( ( x1 - x ) * ( x1 - x ) + ( y1 - y ) * ( y1 - y ) > r * ( y1 + y ) ) {
        blue = "YES" ;
      }
    }
  }
  System . out . println ( red ) ;
  System . out . println ( blue ) ;
}
