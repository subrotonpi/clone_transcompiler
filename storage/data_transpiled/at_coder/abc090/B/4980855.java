public static int p ( int a , int b ) {
  int count = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    String [ ] si = String . valueOf ( i ) ;
    if ( si [ 0 ] . equals ( si [ si . length - 1 ] ) && si [ 1 ] . equals ( si [ si . length - 2 ] ) ) count ++ ;
  }
  return count ;
}
