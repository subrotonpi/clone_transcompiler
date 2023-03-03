public static int area2 ( int x1 , int y1 , int x2 , int y2 , int x3 , int y3 ) throws IOException {
  int vx1 = x2 - x1 ;
  int vx2 = x3 - x1 ;
  int vy1 = y2 - y1 ;
  int vy2 = y3 - y1 ;
  return Math . abs ( vx1 * vy2 - vx2 * vy1 ) ;
  /* find v */
  for ( int x1 = xrange ( N + 1 ) ;
  x1 < xrange ( N + 1 ) ;
  x1 ++ ) {
    for ( int y1 = xrange ( M + 1 ) ;
    y1 < xrange ( N + 1 ) ;
    y1 ++ ) {
      for ( int x2 = xrange ( N + 1 ) ;
      x2 < xrange ( N + 1 ) ;
      x2 ++ ) {
        for ( int y2 = xrange ( M + 1 ) ;
        y2 < xrange ( M + 1 ) ;
        y2 ++ ) {
          if ( ( area2 ( 0 , 0 , x1 , y1 , x2 , y2 ) == A ) ) {
            return ( 0 ) ;
          }
        }
      }
    }
  }
  String file = "B-small-attempt0.in" ;
  BufferedReader br = new BufferedReader ( new FileReader ( file ) ) ;
  PrintWriter of = new PrintWriter ( new FileOutputStream ( "B-large.out" ) ) ;
  int C = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int x = xrange ( C ) ;
  x < xrange ( N + 1 ) ;
  x ++ ) {
    String [ ] l = br . readLine ( ) . split ( "\\s+" ) ;
    int N = Integer . parseInt ( l [ 0 ] ) ;
    int M = Integer . parseInt ( l [ 1 ] ) ;
    int A = Integer . parseInt ( l [ 2 ] ) ;
    int [ ] points = find_v ( N , M , A ) ;
    if ( ( points != null ) && ( points . length > 0 ) ) {
      print > of . println ( "Case #" + ( x + 1 ) + ": " + points [ 0 ] + " " + points [ 3 ] + " " + points [ 1 ] + " " + points [ 4 ] + " " + points [ 2 ] + " " + points [ 5 ] ) ;
    }
    else {
      print > of . println ( "Case #" + ( x + 1 ) + ": IMPOSSIBLE" ) ;
    }
  }
  return 0 ;
}
