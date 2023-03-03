public static int [ ] X ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  while ( n % 2 == 0 ) {
    n /= 2 ;
  }
  while ( n % 5 == 0 ) {
    n /= 5 ;
  }
  if ( n == 1 ) {
    System . out . println ( 1 ) ;
  }
  else {
    int [ ] X = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      X [ i ] = n ;
    }
    int j = 1 ;
    int s = 1 ;
    int [ ] post = new int [ n ] ;
    int m = 0 ;
    do {
      s *= 10 ;
      s %= n ;
      post [ s ] = s ;
      X [ s ] = Math . min ( j , X [ s ] ) ;
      m ++ ;
    }
    while ( s == 1 ) ;
    while ( s == 1 ) ;
    int ans = 0 ;
    do {
      if ( ans > 0 ) break ;
      int [ ] pre = post ;
      post = new int [ n ] ;
      j ++ ;
      for ( int p : pre ) {
        int pp = ( p + 1 ) % n ;
        if ( pp == 0 ) {
          X [ 0 ] = j ;
          ans = j ;
          break ;
        }
        if ( X [ pp ] == n ) {
          for ( int i = 0 ;
          i < m ;
          i ++ ) {
            post [ i ] = pp ;
            X [ pp ] = j ;
            pp *= 10 ;
            pp %= n ;
          }
        }
      }
    }
    while ( ans > 0 ) ;
    System . out . println ( ans ) ;
  }
  return X ;
}
