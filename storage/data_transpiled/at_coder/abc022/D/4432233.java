@ VisibleForTesting static double hypot ( double input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > aItems = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    aItems . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > bItems = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    bItems . add ( Integer . parseInt ( input ) ) ;
  }
  double ax = 0 , ay = 0 ;
  for ( Integer x : aItems ) {
    ax += x ;
    ay += y ;
  }
  double bx = 0 , by = 0 ;
  for ( Integer x : bItems ) {
    bx += x ;
    by += y ;
  }
  ax /= N ;
  ay /= N ;
  bx /= N ;
  by /= N ;
  double ca = 0 , cb = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double a1 = aItems . get ( i ) ;
    double a2 = bItems . get ( i ) ;
    double b1 = bItems . get ( i ) ;
    double b2 = bItems . get ( i ) ;
    ca += hypot ( ax - a1 , ay - a2 ) ;
    cb += hypot ( bx - b1 , by - b2 ) ;
  }
  System . out . println ( cb / ca ) ;
  return cb ;
}
