public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] P = new int [ N + 1 ] ;
  int [ ] size = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = i ;
  }
  {
    int a = P [ 0 ] ;
    int b = P [ 1 ] ;
    if ( P [ a ] == P [ b ] ) {
      return P [ a ] ;
    }
    else {
      return find ( P [ a ] ) ;
    }
  }
  {
    int a = P [ 0 ] ;
    int b = P [ 1 ] ;
    if ( size [ a ] > size [ b ] ) {
      size [ a ] += size [ b ] ;
      P [ b ] = P [ a ] ;
    }
    else if ( size [ a ] > size [ b ] ) {
      size [ b ] += size [ a ] ;
      P [ a ] = P [ b ] ;
    }
    else if ( size [ a ] == size [ b ] ) {
      size [ a ] += size [ b ] ;
      P [ b ] = P [ a ] ;
    }
  }
  int [ ] L = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = Integer . parseInt ( input ) ;
    int v = Integer . parseInt ( input ) ;
    L [ i ] = u ;
    if ( P [ i ] == v ) {
    }
    else {
      union ( u , v ) ;
    }
  }
  int [ ] NO = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) {
    NO [ P [ i ] ] ++ ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    if ( i == P [ i ] && size [ i ] - NO [ i ] == 1 ) ans ++ ;
  }
  System . out . println ( ans - 1 ) ;
  return L ;
}
