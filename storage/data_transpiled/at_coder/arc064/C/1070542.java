@ GwtIncompatible ( "java.util.concurrent.atomic.LongArray" ) public static long [ ] [ ] dijkstra ( long [ ] [ ] a , long [ ] [ ] b ) {
  long [ ] [ ] edges = new long [ 2 ] [ 2 ] ;
  int x1 = a [ 0 ] ;
  int y1 = a [ 1 ] ;
  int r1 = a [ 0 ] ;
  long [ ] x2 = a [ 0 ] ;
  int y2 = b [ 0 ] ;
  int r2 = b [ 1 ] ;
  long dx = x1 - x2 ;
  long dy = y1 - y2 ;
  long d = Math . sqrt ( dx * dx + dy * dy ) ;
  return Math . max ( 0 , d - r1 - r2 ) ;
}
