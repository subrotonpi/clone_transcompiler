public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] G = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    G [ a ] [ b ] = new int [ b ] ;
    G [ b ] [ a ] = new int [ a ] ;
  }
  @ SuppressWarnings ( "unchecked" ) int [ ] [ ] que = {
    new int [ N ] }
    ;
    int [ ] [ ] costM = new int [ N ] [ N ] ;
    int [ ] bMin = new int [ N ] ;
    Arrays . fill ( costM , - 1 ) ;
    Arrays . fill ( bMin , - 1 ) ;
    while ( que . length > 0 ) {
      int cost = que [ 0 ] [ 0 ] ;
      int v = que [ 0 ] [ 1 ] ;
      if ( costM [ v ] < cost ) continue ;
      for ( int w = 0 ;
      w < G [ v ] [ 0 ] ;
      w ++ ) {
        if ( G [ v ] [ w ] == 0 ) {
          if ( cost + 1 < costM [ w ] ) {
            costM [ w ] = cost + 1 ;
            heappush ( que , new int [ ] {
              cost + 1 , w }
              ) ;
            }
          }
          else {
            if ( cost + N < costM [ w ] ) {
              costM [ w ] = cost + N ;
              heappush ( que , new int [ ] {
                cost + N , w }
                ) ;
              }
            }
          }
          for ( int i = 0 ;
          i < N ;
          i ++ ) {
            bMin [ i ] = b = costM [ i ] [ i ] / N ;
            costM [ i ] = ( ( costM [ i ] % N ) + b * ( b + 1 ) / 2 ) + 1 ;
          }
          que = new int [ N ] [ ] ;
          Arrays . fill ( cost , - 1 ) ;
          dist = new int [ N ] [ ] ;
          for ( int i = 0 ;
          i < N ;
          i ++ ) {
            dist [ i ] [ 0 ] = bMin [ i ] ;
          }
          dist [ 0 ] [ 0 ] = 0 ;
          while ( que . length > 0 ) {
            int cost = que