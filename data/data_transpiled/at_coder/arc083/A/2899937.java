public static void print ( String input , int a , int b , int c , int d , int e , int f ) {
  int [ ] ans = null ;
  float g = 0 ;
  for ( int i = 0 ;
  i < f / ( a * 100 ) + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < ( f - a * i * 100 ) / ( b * 100 ) + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < Math . min ( ( f - a * i * 100 - b * j * 100 ) / c , e * ( a * i + b * j ) / c ) + 1 ;
      k ++ ) {
        int l = Math . min ( ( e * ( a * i + b * j ) - k * c ) / d , ( f - 100 * a * i - 100 * b * j - c * k ) / d ) ;
        if ( ( a * i * 100 + b * j * 100 + c * k + d * l ) > 0 && ( a * i * 100 + b * j * 100 + c * k + d * l ) <= f ) {
          if ( g < ( k * c + d * l ) / ( a * i * 100 + b * j * 100 + c * k + d * l ) ) {
            g = ( k * c + d * l ) / ( a * i * 100 + b * j * 100 + c * k + d * l ) ;
            ans = new float [ ] {
              a * i * 100 + b * j * 100 + c * k + d * l , k * c + d * l }
              ;
            }
          }
        }
      }
    }
    if ( ans . length == 0 ) {
      System . out . println ( Math . min ( a , b ) * 100 + 0 ) ;
    }
    else {
      System . out . println ( Arrays . toString ( ans ) ) ;
    }
  }
  