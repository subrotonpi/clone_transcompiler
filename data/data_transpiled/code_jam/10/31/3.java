public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = in . nextInt ( ) ;
    Point [ ] points = new Point [ N ] ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      int a = in . nextInt ( ) ;
      int b = in . nextInt ( ) ;
      points [ n ] = new Point ( a , b ) ;
    }
    Arrays . sort ( points ) ;
    int c = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int x1 = points [ i ] . x ;
      int y1 = points [ i ] . y ;
      for ( int j = i + 1 ;
      j < N ;
      j ++ ) {
        int x2 = points [ j ] . x ;
        int y2 = points [ j ] . y ;
        if ( ( x2 - x1 ) * ( y2 - y1 ) < 0 ) {
          c ++ ;
        }
      }
    }
    System . out . println ( "Case #" + t + ": " + c ) ;
  }
  return T ;
}
