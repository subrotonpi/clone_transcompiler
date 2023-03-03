@ Nullable private static Pair < Integer , Integer > solve ( int a , int n , int m ) {
  for ( int x1 : xrange ( 0 , n + 1 ) ) {
    for ( int x2 : xrange ( 0 , n + 1 ) ) {
      for ( int y1 : xrange ( 0 , m + 1 ) ) {
        int x1y2 = a + y1 * x2 ;
        if ( x1 == 0 ) {
          if ( x1y2 == 0 ) {
            return new Pair < > ( x1 , y1 , x2 , 1 ) ;
          }
          continue ;
        }
        if ( x1y2 % x1 != 0 ) {
          continue ;
        }
        int y2 = x1y2 / x1 ;
        if ( 0 <= y2 && y2 <= m ) {
          return new Pair < > ( x1 , y1 , x2 , y2 ) ;
        }
      }
    }
  }
  return null ;
}
