@ VisibleForTesting static double min ( double x , double y ) {
  x = Integer . parseInt ( input . nextLine ( ) ) ;
  y = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  a . add ( a . get ( 0 ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  Iterator < List < Integer >> it = a . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    int x1 = it . next ( ) ;
    int y1 = it . next ( ) ;
    int x2 = it . next ( ) ;
    int y2 = it . next ( ) ;
    double d ;
    if ( x1 == x2 ) {
      d = Math . abs ( x - x1 ) ;
    }
    else if ( y1 == y2 ) {
      d = Math . abs ( y - y1 ) ;
    }
    else {
      double inc = ( y2 - y1 ) / ( x2 - x1 ) ;
      a = inc ;
      b = - 1 ;
      c = - inc * x1 + y1 ;
      d = Math . abs ( ( a * x + b * y + c ) / Math . sqrt ( a * a + b * b ) ) ;
    }
    ans = Math . min ( ans , d ) ;
  }
  return ans ;
}
