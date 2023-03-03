public static void convexHull ( List < Point > points ) {
  points = new ArrayList < Point > ( new HashSet < Point > ( points ) ) ;
  if ( points . size ( ) <= 1 ) {
    return ;
  }
  /* Cross the points */
  List < Point > a = new ArrayList < Point > ( ) ;
  for ( Point p : points ) {
    while ( lower . size ( ) >= 2 && cross ( lower . get ( lower . size ( ) - 2 ) , lower . get ( lower . size ( ) - 1 ) , p ) <= 0 ) {
      lower . remove ( lower . size ( ) - 1 ) ;
    }
    lower . add ( p ) ;
  }
  List < Point > upper = new ArrayList < Point > ( ) ;
  for ( Point p : new ArrayList < Point > ( points ) ) {
    while ( upper . size ( ) >= 2 && cross ( upper . get ( upper . size ( ) - 2 ) , upper . get ( upper . size ( ) - 1 ) , p ) <= 0 ) {
      upper . remove ( upper . size ( ) - 1 ) ;
    }
    upper . add ( p ) ;
  }
  @ SuppressWarnings ( "unchecked" ) Iterator < Point > itr = new Iterator < Point > ( ) {
    private boolean collinear ( Point p0 , Point p1 , Point p2 ) {
      int x1 = p1 . x - p0 . x , y1 = p1 . y - p0 . y ;
      int x2 = p2 . x - p0 . x , y2 = p2 . y - p0 . y ;
      return x1 * y2 - x2 * y1 < 1e-12 ;
    }
  }
  ;
  while ( itr . hasNext ( ) ) {
    int t = itr . next ( ) ;
    int n = itr . nextInt ( ) ;
    Point [ ] pts = new Point [ n ] ;
    int [ ] ans = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int x = Integer . parseInt ( itr . next ( ) ) ;
      int y = Integer . parseInt ( itr . next ( ) ) ;
      pts [ i ] = new Point ( x , y ) ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( Arrays . equals ( ans , pts [ i ] ) ) {
        break ;
      }
      for ( Point x : itr ) {
        List < Point > hull = convexHull ( x ) ;
        hull . add ( hull . get ( 0 ) ) ;
        int lh = hull . size ( ) -