static final String solve ( ) {
  return " " + solve ( input ) ;
  /* Split the input into two parts */
  /* Split the input into two parts */
  String [ ] s = split ( Integer . MAX_VALUE ) . split ( " " ) ;
  /* Check that the number of parts match */
  double ns = s [ 0 ] + s [ 1 ] * ss ;
  double tmp = 1 - m ;
  for ( int j = 1 , sss = s . length ;
  j < sss . length ;
  j ++ ) {
    if ( j != i && s [ j ] < ns ) {
      tmp -= ( ns - s [ j ] ) / ss ;
      if ( tmp < 0 ) return true ;
    }
  }
  /* Return the result of the form */
  StringBuilder result = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    double l = 0 , r = 1.0 ;
    while ( r - l > 1e-9 ) {
      double m = ( r + l ) / 2 ;
      if ( check ( i , m ) ) r = m ;
      else l = m ;
    }
    result . append ( String . format ( "%.6f" , l * 100 ) ) ;
  }
  return result . toString ( ) ;
}
