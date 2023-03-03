public static int [ ] [ ] solve ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) , W = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] vs = new int [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < vs . length ;
  i ++ ) {
    int w1 = Integer . parseInt ( input . readLine ( ) ) ;
    int v1 = Integer . parseInt ( input . readLine ( ) ) ;
    vs [ 0 ] [ i ] = v1 ;
    for ( int j = 0 ;
    j < N - 1 ;
    j ++ ) {
      int w = Integer . parseInt ( input . readLine ( ) ) ;
      int v = Integer . parseInt ( input . readLine ( ) ) ;
      vs [ w - w1 ] [ v ] = v ;
    }
  }
  int [ ] [ ] s = new int [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    Arrays . sort ( vs [ i ] ) ;
    for ( int j = 0 ;
    j < vs [ i ] . length ;
    j ++ ) {
      s [ i ] [ j ] = s [ i ] [ vs [ i ] . length - 1 ] + vs [ i ] [ vs [ i ] . length - j - 1 ] ;
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( i > vs [ 0 ] . length ) break ;
    if ( i * w1 > W ) break ;
    int si = s [ 0 ] [ i ] ;
    for ( int j = 0 ;
    j < N + 1 - i ;
    j ++ ) {
      if ( j > vs [ 1 ] . length ) break ;
      if ( i * w1 + j * ( w1 + 1 ) > W ) break ;
      int sj = si ;
      sj += s [ 1 ] [ j ] ;
      for ( int k = 0 ;
      k < N + 1 - i - j ;
      k ++ ) {
        if ( k > vs [ 2 ] . length ) break ;
        if ( i * w1 + j * ( w1 + 1 ) + k * ( w1 + 2 ) > W ) break ;
        int sk = sj ;
        sk += s [ 2 ] [ k ] ;
        for ( int l = 0 ;
        l < N + 1 - i - j - k ;
        l ++ ) {
          if ( l > vs [ 3 ] . length ) break ;
          if ( i *