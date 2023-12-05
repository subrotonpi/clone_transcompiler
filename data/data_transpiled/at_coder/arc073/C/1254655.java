public static double [ ] [ ] getPoints ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  double xmin = 0 ;
  double ymin = Double . MIN_VALUE ;
  double xmax = 0 ;
  double ymax = 0 ;
  Point [ ] p = new Point [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( x > y ) {
      x = y ;
      y = x ;
    }
    p [ i ] = new Point ( x , y ) ;
    if ( x < xmin ) {
      xmin = x ;
    }
    else if ( x > xmax ) {
      xmax = x ;
    }
    if ( y < ymin ) {
      ymin = y ;
    }
    else if ( y > ymax ) {
      ymax = y ;
    }
  }
  double ret = ( ymax - ymin ) * ( xmax - xmin ) ;
  Arrays . sort ( p ) ;
  double dx = p [ N - 1 ] [ 0 ] ;
  return ret ;
}
