public static void print ( int x1 , int y1 , int r ) {
  int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int x3 = Integer . parseInt ( input . nextLine ( ) ) ;
  int y3 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( x2 <= x1 - r ) && ( x1 + r <= x3 ) && ( y2 <= y1 - r ) && ( y1 + r <= y3 ) ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  int tmp = 0 ;
  Point [ ] L = {
    new Point ( x2 , y2 ) , new Point ( x2 , y3 ) , new Point ( x3 , y2 ) , new Point ( x3 , y3 ) }
    ;
    for ( Point p : L ) {
      int x = p . x ;
      int y = p . y ;
      if ( ( x - x1 ) * x + ( y - y1 ) * y <= r * r ) {
        tmp ++ ;
      }
    }
    if ( tmp == 4 ) {
      System . out . println ( "NO" ) ;
    }
    else {
      System . out . println ( "YES" ) ;
    }
  }
  