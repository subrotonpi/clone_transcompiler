@ VisibleForTesting static Iterable < Point > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Point >> XY = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    XY . add ( Collections . singletonList ( new Point ( input . nextLine ( ) ) ) ) ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < XY . size ( ) ;
  i += 3 ) {
    Point a = XY . get ( i ) ;
    Point b = XY . get ( i + 1 ) ;
    Point c = XY . get ( i + 2 ) ;
    int x1 = a . x - c . x ;
    int y1 = a . y - c . y ;
    int x2 = b . x - c . x ;
    int y2 = b . y - c . y ;
    int s = Math . abs ( x1 * y2 - y1 * x2 ) ;
    if ( s != 0 && s % 2 == 0 ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
  return XY ;
}
