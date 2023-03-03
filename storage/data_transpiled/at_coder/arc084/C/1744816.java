public static int [ ] solve ( int k , int n ) {
  if ( ( k & 1 ) == 0 ) {
    return new int [ ] {
      k / 2 }
      ;
    }
    int [ ] ans = new int [ n ] ;
    ans [ 0 ] = k / 2 + 1 ;
    int l = n ;
    for ( int i = 0 ;
    i < ( n - 2 ) / 2 + 1 ;
    i ++ ) {
      if ( ans [ ans . length - 1 ] == 1 ) {
        ans [ ans . length - 1 ] -- ;
        l -- ;
      }
      else {
        ans [ ans . length - 1 ] -- ;
      }
    }
    return ans ;
  }
  