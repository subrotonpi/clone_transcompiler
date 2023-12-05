static private double calDistance ( int x , int y , int s , int t ) {
  final int x1 = Math . min ( x , s ) ;
  final int y1 = Math . min ( y , t ) ;
  final int r = Math . max ( x , t ) ;
  final int x2 = Math . min ( x , s ) ;
  final int y2 = Math . min ( y , t ) ;
  final int x3 = Math . min ( x , t ) ;
  final int y3 = Math . min ( y , t ) ;
  if ( x2 <= x1 - r && x3 >= x1 + r && y2 <= y1 - r && y3 >= y1 + r ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  if ( calDistance ( x2 , y2 , x1 , y1 ) <= r && calDistance ( x2 , y3 , x1 , y1 ) <= r && calDistance ( x3 , y2 , x1 , y1 ) <= r && calDistance ( x3 , y3 , x1 , y1 ) <= r ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  return Math . sqrt ( ( x2 - x1 ) * ( y2 - y1 ) + ( x3 - x1 ) * ( y3 - y1 ) ) ;
}
