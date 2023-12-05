static final void main ( Scanner iScanner ) {
  final int n2 = iScanner . nextInt ( ) ;
  final int [ ] [ ] b = new int [ n2 ] [ ] ;
  int [ ] [ ] a = new int [ n2 ] [ ] ;
  int [ ] [ ] [ ] a = new int [ n2 ] [ ] [ ] ;
  int [ ] [ ] [ ] a = new int [ n2 ] [ ] [ ] ;
  for ( int i = 0 ;
  i < n2 ;
  i ++ ) {
    int [ ] dir = new int [ ] [ ] ;
    int x2 = i + dir [ 0 ] ;
    int y2 = i + dir [ 1 ] ;
    if ( x2 < 0 || x2 >= m2 ) continue ;
    if ( y2 < 0 || y2 >= m2 ) continue ;
    int [ ] [ ] t2 = calct ( res , x , y , x2 , y2 , a [ cx ] [ cy ] ) ;
    int [ ] [ ] a = new int [ n2 ] [ ] ;
    int [ ] [ ] a = new int [ n2 ] [ ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int [ ] t = new int [ ] [ ] ;
      for ( int x = 0 ;
      x < t . length ;
      x ++ ) {
        a [ i ] = new int [ ] [ ] ;
      }
      for ( int x = 0 ;
      x < t . length ;
      x ++ ) {
        a [ i ] [ x ] = a [ i ] [ x ] ;
      }
      for ( int j = 0 ;
      j < m ;
      j ++ ) {
        int [ ] t2 = t . length > 3 * j ? t [ 3 * j ] : t [ 3 * j ] ;
        t2 [ 2 ] %= ( t2 [ 0 ] + t2 [ 1 ] ) ;
        int mod = t2 [ 0 ] + t2 [ 1 ] ;
        int r = t2 [ 2 ] ;
        int [ ] t3 = new int [ 3 ] ;
        t3 [ 0 ] = new int [ ] ;
        t3 [ 1 ] = new int [ ] ;
        t3 [ 2 ] = new int [ ] ;
        t3 [ 3 ] = new int [ ] {
          r , 1 }
          ;
          r += t2 [ 0 ] ;
          if ( r >= mod ) {
            t3 [ 0 ] = new int [ ] {
              mod , 0 }
              ;
              t3 [ 1 ] = new int [ ] {
                r % mod , 0 }
                ;
              }
            }
            a [ i ] [ j ] = a [ i ] [ j ]