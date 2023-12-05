public static void a ( int a , int b , int c , int d , int e , int f ) {
  int x = 100 * a , y = 0 , z = 0 ;
  for ( int i = 0 ;
  i < 31 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 31 ;
    j ++ ) {
      int mizu = ( a * i + b * j ) * 100 ;
      if ( mizu == 0 || mizu > f ) break ;
      for ( int k = 0 ;
      k < ( int ) ( ( f - mizu ) / c ) ;
      k ++ ) {
        for ( int l = 0 ;
        l < ( int ) ( ( f - mizu ) / d ) ;
        l ++ ) {
          int sato = c * k + d * l ;
          int noudo = 100 * sato / ( mizu + sato ) ;
          if ( mizu + sato > f || mizu / 100 * e < sato ) break ;
          if ( noudo > z ) z = noudo ;
          x = mizu + sato ;
          y = sato ;
        }
      }
    }
  }
  System . out . println ( x + " " + y ) ;
}
