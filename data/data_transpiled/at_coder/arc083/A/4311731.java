public static int a , int b , int c , int d , int e , int f ;
int x = 1 ;
int y = - 1 ;
for ( int i = 0 ;
i <= f ;
i += a ) {
  for ( int j = 0 ;
  j <= f + 1 - i ;
  j += b ) {
    int s = Math . min ( f - i - j , ( i + j ) * e / 100 ) ;
    if ( i + j == 0 ) {
      continue ;
    }
    else {
      for ( int p = 0 ;
      p <= s ;
      p += c ) {
        for ( int q = 0 ;
        q <= s + 1 - p && q < d ;
        q += d ) {
          if ( y / x <= ( p + q ) / ( i + j ) ) {
            y = p + q ;
            x = i + j ;
          }
        }
      }
    }
  }
}
System . out . println ( x + y + y ) ;
return y ;
}
