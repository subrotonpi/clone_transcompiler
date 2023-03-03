public static String solve ( int n , int m , int a ) {
  for ( int x2 : xrange ( 0 , n + 1 ) ) {
    for ( int y1 : xrange ( 0 , m + 1 ) ) {
      int b = a + x2 * y1 ;
      for ( int x1 : xrange ( 1 , n + 1 ) ) {
        if ( b % x1 == 0 && b / x1 <= m ) {
          return "" + 0 + " " + 0 + " " + x1 + " " + y1 + " " + x2 + " " + b / x1 ;
        }
      }
    }
  }
  return "IMPOSSIBLE" ;
}
