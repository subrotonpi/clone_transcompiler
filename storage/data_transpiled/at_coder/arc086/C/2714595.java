@ VisibleForTesting static int [ ] [ ] solve ( int [ ] [ ] input ) {
  int N = Integer . parseInt ( input [ 0 ] ) ;
  int [ ] * P = Integer . parseInt ( input [ 1 ] ) , c = Integer . parseInt ( input [ 2 ] ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] [ ] G = new int [ N + 1 ] [ N + 1 ] ;
  int [ ] U = new int [ N + 1 ] ;
  int [ ] C = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    G [ i ] [ p ] = i + 1 ;
    U [ i + 1 ] = u = U [ p ] + 1 ;
    C [ u ] ++ ;
  }
  int [ ] [ ] Q = new int [ N + 1 ] [ N + 1 ] ;
  HashMap < Integer , Integer > PP = new HashMap < > ( ) ;
  {
    int k ;
    int p ;
    int r ;
    int p ;
    int k ;
    int [ ] e ;
    P [ 0 ] = P [ 0 ] ;
    P [ 1 ] = P [ 1 ] ;
    if ( p < 0 ) {
      PP . put ( p , p = Math . pow ( 2 , p , MOD ) ) ;
      return P ;
    }
    return PP . get ( p ) ;
  }
  {
    L = new int [ N + 1 ] ;
    ept = new int [ N + 1 ] ;
    int sz = L . length ;
    for ( int i = N ;
    i >= 0 ;
    -- i ) {
      int [ ] g = G [ i ] ;
      if ( g == null ) continue ;
      Arrays . sort ( g , sz , true ) ;
      k = g . length ;
      e = new int [ ] {
        pp ( k ) - k , k , 0 }
        ;
        int g0 = g [ 0 ] ;
        L [ i ] = L [ g0 ] + 1 ;
        if ( L [ g0 ] == 0 ) {
          Q [ i ] = new int [ ] {
            e }
            ;
            continue ;
          }
          Q [ i ] = R = Q [ g0 ] ;
          if ( k > 1 ) {
            for ( int j = 0 ;
            j < g . length ;
            ++ j ) {
              int [ ] S = Q [ g [ j ] ] ;
              if ( S == null ) break ;
              for ( int j = 0 ;
              j < s . length ;
              ++ j ) {
                int b0 = S [ j ] ;
                int b1