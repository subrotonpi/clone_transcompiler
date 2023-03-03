public static int D = Integer . parseInt ( input ) {
  int G = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > [ ] points = new List [ D ] ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    points [ i ] = Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  /* solve the number of points */
  if ( G <= 0 ) {
    return 10 * 5 ;
  }
  int n = Math . min ( G / ( 100 * d ) , points [ d - 1 ] . intValue ( ) ) ;
  int s = 100 * d * n ;
  if ( n == points [ d - 1 ] . intValue ( ) ) {
    s = d * points [ d - 1 ] . intValue ( ) * 100 + points [ d - 1 ] . intValue ( ) ;
  }
  if ( g > s ) {
    n += solve ( d - 1 , g - s ) ;
  }
  return Math . min ( n , solve ( d - 1 , g ) ) ;
}
