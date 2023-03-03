public static double dist ( double x1 , double y1 , double x2 , double y2 ) {
  return ( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) ) * 0.5 ;
  /* Distance between two points */
  double distHigh = Math . max ( dist ( xyr [ index1 ] [ 0 ] , xyr [ index1 ] [ 1 ] , xyr [ index2 ] [ 0 ] , xyr [ index2 ] [ 1 ] ) - ( xyr [ index1 ] [ 2 ] + xyr [ index2 ] [ 2 ] ) , 0 ) ;
  /* Minimum value index */
  double minValue = Double . MIN_VALUE ;
  int minIndex = - 1 ;
  for ( int i = 0 ;
  i < array . length ;
  i ++ ) {
    if ( minValue > array [ i ] [ 0 ] ) {
      minValue = array [ i ] [ 1 ] ;
      minIndex = i ;
    }
  }
  /* Distance between two points */
  double stx = Double . parseDouble ( input . nextLine ( ) ) ;
  double sty = Double . parseDouble ( input . nextLine ( ) ) ;
  double enx = Double . parseDouble ( input . nextLine ( ) ) ;
  double eny = Double . parseDouble ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  xyr = new double [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xyr [ i ] [ 0 ] = stx ;
    xyr [ i ] [ 1 ] = sty ;
    xyr [ i ] [ 2 ] = 0 ;
    xyr [ i ] [ 3 ] = 0 ;
    xyr [ i ] [ 4 ] = 0 ;
    xyr [ i ] [ 5 ] = 0 ;
    xyr [ i ] [ 6 ] = 0 ;
    xyr [ i ] [ 7 ] = 0 ;
  }
  /* Distance between two points */
  double nodes [ ] = new double [ xyr . length ] ;
  for ( int i = 0 ;
  i < xyr . length ;
  i ++ ) {
    nodes [ i ] = xyr [ i ] ;
  }
  nodes [ 0 ] = nodes [ n ] ;
  now = minIndex ( nodes . entrySet ( ) ) . getValue ( ) ;
  return nodes [ n + 1 ] ;
}
