public static String bCone ( int N , int Q , int [ ] Cones , int [ ] [ ] Queries ) {
  final StringBuilder ans_tmp = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < Queries . length ;
  i ++ ) {
    int a = Queries [ i ] [ 0 ] ;
    int b = Queries [ i ] [ 1 ] ;
    double volumeSum = 0 ;
    for ( int j = 0 ;
    j < Cones . length ;
    j ++ ) {
      int x = Cones [ j ] [ 0 ] ;
      int r = Cones [ j ] [ 1 ] ;
      int h = Queries [ j ] [ 2 ] ;
      double v1 ;
      if ( x <= a && a <= x + h ) {
        v1 = ( ( x + h - a ) * ( x + h - a ) ) / ( h * h ) * Math . PI * ( r * r ) / 3 ;
      }
      else if ( a < x ) {
        v1 = Math . PI * ( r * r ) * h / 3 ;
      }
      else {
        v2 = 0 ;
      }
      volumeSum += v1 - v2 ;
    }
    ans_tmp . append ( String . valueOf ( Math . round ( volumeSum ) ) ) ;
  }
  String ans = ans_tmp . toString ( ) ;
  return ans ;
}
