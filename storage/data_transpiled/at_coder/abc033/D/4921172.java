@ InputFunction public static @ Primitive Primitive < Integer > triangle ( @ InputInt final int N , @ NonNull final List < ? extends Number > points ) {
  int acute = 0 , right = 0 , obtuse = 0 ;
  final double right_m = PI / 2 - 1e-9 ;
  final double right_p = PI / 2 + 1e-9 ;
  final double PI2 = PI * 2 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final double x0 = points . get ( i ) . doubleValue ( ) ;
    final double y0 = points . get ( i ) . doubleValue ( ) ;
    final double [ ] angles = new double [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      angles [ j ] = Math . atan2 ( y - y0 , x - x0 ) ;
    }
    Arrays . sort ( angles ) ;
    int s = bisect_left ( angles , angles . length + right_m ) ;
    int t = bisect_left ( angles , angles . length + pi ) ;
    Arrays . sort ( angles , t + PI2 ) ;
    for ( int j = 0 ;
    j < N - 1 ;
    j ++ ) {
      angles [ s ] += PI2 ;
    }
    for ( int j = 0 ;
    j < N - 1 ;
    j ++ ) {
      double r = angles [ j ] ;
      while ( angles [ s ] < r + right_m ) {
        s ++ ;
      }
      while ( angles [ s ] <= r + right_p ) {
        s ++ ;
        right ++ ;
      }
      while ( angles [ t ] < r + PI ) {
        t ++ ;
      }
      obtuse += t - s ;
    }
  }
  acute = N * ( N - 1 ) * ( N - 2 ) / 6 - ( right + obtuse ) ;
  return acute ;
}
