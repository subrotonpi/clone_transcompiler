public static void Triangle ( ) {
  int x , y , z ;
  int i ;
  int j ;
  int n ;
  int A , B , C , D ;
  int x , y , M ;
  int i ;
  int j ;
  int i ;
  int x ;
  int y ;
  int i ;
  int j ;
  int k ;
  int M ;
  System . out . println ( "Case #" + i + ": " + r ) ;
  x = x1 ;
  y = y1 ;
  x = x2 ;
  y = y2 ;
  x = x3 ;
  y = y3 ;
  i = i ;
  j = i + 1 ;
  if ( Double . isInfinite ( x ) && Double . isInfinite ( y ) ) {
    x = x + x ;
    y = y ;
  }
  else {
    x = x ;
    y = y ;
  }
  if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
    @ SuppressWarnings ( "resource" ) Scanner s = new Scanner ( System . in ) ;
    s . useDelimiter ( "\\Z" ) ;
    s . next ( ) ;
    N = s . nextInt ( ) ;
    for ( i = 1 ;
    i <= N ;
    i ++ ) {
      Arrays . fill ( n , ( byte ) 0 ) ;
      A = s . nextInt ( ) ;
      B = s . nextInt ( ) ;
      C = s . nextInt ( ) ;
      D = s . nextInt ( ) ;
      x = s . nextInt ( ) ;
      y = s . nextInt ( ) ;
      M = s . nextInt ( ) ;
      l = new ArrayList < Point > ( ) ;
      l . add ( new Point ( x , y ) ) ;
      for ( j = 1 ;
      j < n ;
      j ++ ) {
        x = ( A * x + B ) % M ;
        y = ( C * y + D ) % M ;
        l . add ( new Point ( x , y ) ) ;
      }
    }
    r = 0 ;
    while ( l . size ( ) > 2 ) {
      Point p = l . get ( 0 ) ;
      l = l . subList ( 1 , l . size ( ) ) ;
      for ( a = 0 ;
      a < l . size ( ) ;
      a ++ ) {
        for ( b = a ;
        b < l . size ( ) ;
        b ++ ) {
          if ( l . get ( a ) != l . get ( b ) && new Triangle ( p . x , p . y , l . get ( a ) . x , l . get ( a ) . y , l . get ( b ) .