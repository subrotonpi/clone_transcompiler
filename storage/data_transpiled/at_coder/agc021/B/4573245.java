static final double [ ] [ ] getPoints ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Point > ps = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ps . add ( new Point ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  Map < Point , Integer > mp = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) mp . put ( new Point ( i ) , i ) ;
  /* ccw (p1.x - p0.x) * (p2.y - p0.y) - (p1.y - p0.y) * (p2.x - p0.x) */
  /* convex hull */
  List < Point > upper = new ArrayList < > ( ) ;
  List < Point > lower = new ArrayList < > ( ) ;
  Collections . sort ( ps ) ;
  for ( int i = 0 ;
  i < ps . size ( ) ;
  i ++ ) {
    Point p = ps . get ( i ) ;
    while ( lower . size ( ) > 1 && ccw ( lower . get ( lower . size ( ) - 2 ) , lower . get ( lower . size ( ) - 1 ) , p ) ) {
      lower . remove ( lower . size ( ) - 1 ) ;
    }
    lower . add ( p ) ;
  }
  for ( int i = ps . size ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    Point p = ps . get ( i ) ;
    while ( upper . size ( ) > 1 && ccw ( upper . get ( upper . size ( ) - 2 ) , upper . get ( upper . size ( ) - 1 ) , p ) ) {
      upper . remove ( upper . size ( ) - 1 ) ;
    }
    upper . add ( p ) ;
  }
  double [ ] [ ] ans = new double [ n ] [ ] ;
  int [ ] ch = convexHull ( ps ) ;
  ch [ 0 ] = ch [ 0 ] ;
  ch [ 1 ] = ch [ 1 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    Point pre = ch [ i ] ;
    Point now = ch [ i ] ;
    Point next = ch [ i + 1 ] ;
    double x0 = now . x - pre . x ;
    double y0 = now . y -