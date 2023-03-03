public static void main ( String input , int a , int b , int c , int d , int e , int f ) {
  int w , s ;
  int s ;
  int ans1 = 100 * a , ans2 = 0 ;
  int t = 0 ;
  for ( int i = 0 ;
  i < 31 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 31 ;
    j ++ ) {
      if ( i == j == 0 ) {
        break ;
      }
      w = ( a * i + b * j ) * 100 ;
      if ( w > f ) {
        break ;
      }
      for ( int k = 0 ;
      k < ( f - w ) / c + 1 ;
      k ++ ) {
        for ( int l = 0 ;
        l < ( f - w ) / d + 1 ;
        l ++ ) {
          s = c * k + d * l ;
          if ( w + s > f ) {
            break ;
          }
          if ( w / 100 * e < s ) {
            break ;
          }
          if ( t < 100 * s / ( w + s ) ) {
            ans1 = w + s ;
            ans2 = s ;
            t = 100 * s / ( w + s ) ;
          }
        }
      }
    }
  }
  System . out . println ( ans1 + " " + ans2 ) ;
}
