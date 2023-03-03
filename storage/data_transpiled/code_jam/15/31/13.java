public static int T = Integer . parseInt ( Scanner in ) {
  int R = in . nextInt ( ) ;
  int W = in . nextInt ( ) ;
  int f1 = C / W ;
  int f2 = C / W ;
  if ( C == W ) return W ;
  if ( C <= 2 * W ) return W + 1 ;
  else return 1 + f2 + f2 + W ;
  /* Do the probability of the input */
  String read = in . next ( ) ;
  int [ ] array = new int [ 3 ] ;
  for ( String k : read . split ( " " ) ) {
    array [ 0 ] = Integer . parseInt ( k ) ;
    array [ 1 ] = Integer . parseInt ( k ) ;
  }
  int R = array [ 0 ] ;
  int C = array [ 1 ] ;
  int W = array [ 2 ] ;
  return Integer . toString ( ( R - 1 ) * f1 ( C , W ) + f2 ) ;
}
