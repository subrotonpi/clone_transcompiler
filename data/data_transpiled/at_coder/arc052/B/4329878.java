public static String bCone ( int N , int Q , int [ ] Cones , int [ ] [ ] Queries ) {
  final StringBuilder ans_tmp = new StringBuilder ( ) ;
  for ( int a = 0 ;
  a < Queries . length ;
  a ++ ) {
    int b = Queries [ a ] [ 0 ] ;
    double volumeSum = 0 ;
    for ( int x = 0 ;
    x < Cones . length ;
    x ++ ) {
      int r = Cones [ x ] [ 0 ] ;
      int h = Queries [ x ] [ 1 ] ;
      double cone_height_a = a <= x + h ? Math . min ( h , x + h - a ) : 0 ;
      double v1 = ( cone_height_a * cone_height_a ) / ( h * h * h ) * Math . PI * ( r * r ) / 3 ;
      double cone_height_b = b <= x + h ? Math . min ( h , x + h - b ) : 0 ;
      double v2 = ( cone_height_b * cone_height_b ) / ( h * h * h ) * Math . PI * ( r * r ) / 3 ;
      volumeSum += v1 - v2 ;
    }
    ans_tmp . append ( String . valueOf ( Math . round ( volumeSum ) ) ) ;
  }
  String ans = ans_tmp . toString ( ) ;
  return ans ;
}
