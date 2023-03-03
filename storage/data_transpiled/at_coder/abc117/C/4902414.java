public static int gcd_core ( int a , int b ) {
  if ( b == 0 ) {
    return a ;
  }
  else {
    return gcd_core ( b , a % b ) ;
  }
  /* Compute the gcd of the array */
  int g = gcd_core ( arr [ 0 ] , arr [ 1 ] ) ;
  for ( int i = 2 ;
  i < arr . length ;
  i ++ ) {
    g = gcd_core ( g , arr [ i ] ) ;
  }
  return g ;
}
