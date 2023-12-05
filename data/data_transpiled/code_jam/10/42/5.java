public static int mincost ( int [ ] [ ] prices , int rnd , int M [ ] , int P ) throws IOException {
  int res = 0 ;
  for ( int num = 0 ;
  num < 2 * ( P - rnd ) ;
  num ++ ) {
    boolean buy = false ;
    for ( int i = 0 ;
    i < M . length ;
    i ++ ) {
      if ( ( int ) ( i / 2 * rnd ) == num ) {
        if ( M [ i ] < P ) {
          buy = true ;
          break ;
        }
      }
    }
    if ( buy ) {
      res += prices [ rnd - 1 ] [ num ] ;
      for ( int i = 0 ;
      i < M . length ;
      i ++ ) {
        if ( ( int ) ( i / 2 * rnd ) == num ) {
          M [ i ] ++ ;
        }
      }
    }
  }
  if ( ( rnd > 1 ) && ( rnd > 1 ) ) {
    res += mincost ( prices , rnd - 1 , M , P ) ;
  }
  return res ;
}
