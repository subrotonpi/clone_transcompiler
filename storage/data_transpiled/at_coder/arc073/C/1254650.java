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
  double dx = p [ N - 1 ] [ 0 ] - p [ 0 ] [ 0 ] ;
  ymin = p [ 0 ] [ 1 ] ;
  double tymin = Double . MIN_VALUE ;
  double tymax = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    tymin = Math . min ( tymin , p [ i ] [ 1 ] ) ;
    xmax = Math . max ( xmax , p [ i ] [ 1 ] ) ;
    xmin = Math . min ( tymin , p [ i + 1 ] [ 0 ] ) ;
    ymin = Math . min ( ymin , p [ i ] [ 0 ] ) ;
    dx = Math . min ( dx , xmax - xmin ) ;
  }
  System . out . println ( Math . min ( ret , ( ymax - ymin ) * dx ) ) ;
  return p ;
}
