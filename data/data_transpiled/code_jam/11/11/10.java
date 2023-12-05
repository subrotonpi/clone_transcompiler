public static int whole_num ( double frac ) {
  int a = ( int ) ( frac * 100 ) ;
  int from_100 = 1 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    if ( a % 2 == 0 ) {
      a /= 2 ;
      from_100 *= 2 ;
    }
    if ( a % 5 == 0 ) {
      a /= 5 ;
      from_100 *= 5 ;
    }
  }
  return 100 / from_100 ;
}
