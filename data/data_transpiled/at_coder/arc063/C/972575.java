@ Function public static void exit ( ) {
  @ SuppressWarnings ( "unchecked" ) Map < String , Integer > map = ( Map < String , Integer > ) map ;
  {
    int n = Integer . parseInt ( input ( ) ) ;
    int a = map . get ( n ) ;
    int b = map . get ( n ) ;
    int p = map . get ( n ) ;
    if ( a % 2 == p ) {
      map . put ( n , a ) ;
    }
    else {
      if ( a <= k - 1 && b <= k ) {
        map . put ( n , a ) ;
      }
      else {
        map . put ( n , a + 1 ) ;
      }
    }
    else {
      if ( a <= k ) {
        map . put ( n , b - 1 ) ;
      }
      else if ( a <= k + 1 && b <= k ) {
        map . put ( n , k + 1 ) ;
      }
      else {
        map . put ( n , a ) ;
      }
    }
  }
  {
    walk2 ( 0 ) ;
    System . out . println ( "Yes" ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      System . out . println ( map . get ( i ) ) ;
    }
  }
  {
    int a = map . get ( n ) ;
    int b = map . get ( n ) ;
    int p = map . get ( n ) ;
    if ( a <= b ) {
      map . put ( n , b + 1 ) ;
    }
    else {
      if ( a <= b ) {
        map . put ( n , a ) ;
      }
      else {
        map . put ( n , a ) ;
      }
    }
  }
  {
    int a = map . get ( n ) ;
    int b = map . get ( n ) ;
    int [ ] edges = new int [ N ] ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      edges [ i ] = new int [ N ] ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      edges [ i ] [ 0 ] = i ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      edges [ i ] [ 1 ] = i ;
    }
  }
  {
    int a = map . get ( n ) ;
    int b = map . get ( n ) ;
    int p = map . get ( n ) ;
    edges [ i ] [ 0 ] = i ;
  }
}
