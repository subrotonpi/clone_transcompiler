public static void print ( int x1 , int y1 , int r , int x2 , int y2 , int x3 , int y3 ) throws IOException {
  int x , y , x3 , y3 ;
  boolean f1 = false ;
  boolean f2 = false ;
  for ( x = x2 ;
  x <= x3 ;
  x ++ ) {
    for ( y = y2 ;
    y <= y3 ;
    y ++ ) {
      if ( ( ( x - x1 ) * ( x - x1 ) + ( y - y1 ) * ( y - y1 ) ) * 0.5 > r ) {
        f1 = true ;
        break ;
      }
    }
    if ( f1 ) break ;
  }
  if ( x2 > x1 - 1 || x1 + r > x3 || y2 > y1 - r || y1 + r > y3 ) f2 = true ;
  if ( f2 ) System . out . println ( "YES" ) ;
  else System . out . println ( "NO" ) ;
  if ( f1 ) System . out . println ( "YES" ) ;
  else System . out . println ( "NO" ) ;
}
